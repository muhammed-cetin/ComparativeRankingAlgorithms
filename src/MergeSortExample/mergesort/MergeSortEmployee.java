package MergeSortExample.mergesort;

import MergeSortExample.model.Employee;
import MergeSortExample.util.ShowProcess;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class MergeSortEmployee {

    private static ArrayList<Employee> sortedEmployeeList = new ArrayList<>();

    public static void sortById(ArrayList<Employee> employeeList) {
        Comparator<Employee> employeeComp = (o1, o2) -> {
            return Long.compare(o2.getId(), o1.getId()); // ASC
        };

        mergeSort(employeeList, employeeComp);

        sortedEmployeeList = employeeList;

        ShowProcess.showValues(sortedEmployeeList);
    }

    public static void sortByName(ArrayList<Employee> employeeList) {
        Comparator<Employee> employeeComp = (o1, o2) -> {
            Collator collator = Collator.getInstance(new Locale("tr", "TR"));
            return collator.compare(o2.getName(), o1.getName()); // ASC
        };

        mergeSort(employeeList, employeeComp);

        sortedEmployeeList = employeeList;

        ShowProcess.showValues(sortedEmployeeList);
    }

    public static void sortBySurName(ArrayList<Employee> employeeList) {
        Comparator<Employee> employeeComp = (o1, o2) -> {
            Collator collator = Collator.getInstance(new Locale("tr", "TR"));
            return collator.compare(o2.getLastname(), o1.getLastname());
        };

        mergeSort(employeeList, employeeComp);

        sortedEmployeeList = employeeList;

        ShowProcess.showValues(sortedEmployeeList);
    }

    public static void sortByAge(ArrayList<Employee> employeeList) {
        Comparator<Employee> employeeComp = (o1, o2) -> Long.compare(o2.getAge(), o1.getAge());

        mergeSort(employeeList, employeeComp);

        sortedEmployeeList = employeeList;

        ShowProcess.showValues(sortedEmployeeList);
    }

    public static void sortByRegisterDate(ArrayList<Employee> employeeList) {
        Comparator<Employee> employeeComp = (o1, o2) -> {
            if (o1.getRegisterDate().before(o2.getRegisterDate())) {
                return 1;
            } else if (o1.getRegisterDate().after(o2.getRegisterDate())) {
                return -1;
            } else {
                return 0;
            }
        };

        mergeSort(employeeList, employeeComp);

        sortedEmployeeList = employeeList;

        ShowProcess.showValues(sortedEmployeeList);
    }

    public static void mergeSort(ArrayList<Employee> personList, Comparator<Employee> compTr) {
        ArrayList<Employee> helper = new ArrayList<Employee>(personList);
        mergeSort(personList, helper, 0, personList.size(), compTr);
    }

    private static void mergeSort(ArrayList<Employee> list,
                                  ArrayList<Employee> helper,
                                  int low,
                                  int high,
                                  Comparator<Employee> compTr) {
        if (high - low >= 2) {
            int middle = low + (high - low) / 2;
            mergeSort(list, helper, low, middle, compTr); //sort left half
            mergeSort(list, helper, middle, high, compTr); //sort right half
            merge(list, helper, low, middle, high, compTr); // merge
        }
    }

    private static void merge(ArrayList<Employee> list,
                              ArrayList<Employee> helper,
                              int low,
                              int middle,
                              int high,
                              Comparator<Employee> compTr) {

        for (int i = low; i < high; i++) {
            helper.set(i, list.get(i));
        }

        int helperLeft = low;
        int helperRight = middle;
        int current = low;

        while (helperLeft < middle && helperRight < high) {
            if (isGreaterThan(helper.get(helperLeft), helper.get(helperRight), compTr)) {
                list.set(current, helper.get(helperLeft));
                helperLeft++;
            } else {
                list.set(current, helper.get(helperRight));
                helperRight++;
            }
            current++;
        }

        // Copy remaining elements
        while (helperLeft < middle) {
            list.set(current, helper.get(helperLeft));
            helperLeft++;
            current++;
        }
    }

    public static boolean isGreaterThan(Employee helperLeft, Employee helperRight, Comparator<Employee> compTr) {
        return greaterThan(compTr, helperLeft, helperRight);
    }

    private static boolean greaterThan(Comparator comp, Employee x, Employee y) {
        return comp.compare(x, y) > 0;
    }
}
