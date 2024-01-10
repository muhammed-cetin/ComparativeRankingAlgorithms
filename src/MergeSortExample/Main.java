package MergeSortExample;

import MergeSortExample.mergesort.MergeSortEmployee;
import MergeSortExample.model.Employee;
import MergeSortExample.util.DefineValues;
import MergeSortExample.util.ShowProcess;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        employeeList = DefineValues.defineValues(employeeList);

        System.out.println("---------------------------------");
        System.out.println("BEFORE MERGE SORT sortById");
        ShowProcess.showValues(employeeList);

        System.out.println("AFTER MERGE SORT sortById");
        MergeSortEmployee.sortById(employeeList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER MERGE SORT sortByName");
        MergeSortEmployee.sortByName(employeeList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER MERGE SORT sortBySurName");
        MergeSortEmployee.sortBySurName(employeeList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER MERGE SORT sortByAge");
        MergeSortEmployee.sortByAge(employeeList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER MERGE SORT sortByRegisterDate");
        MergeSortEmployee.sortByRegisterDate(employeeList);
        System.out.println("---------------------------------");


    }
}
