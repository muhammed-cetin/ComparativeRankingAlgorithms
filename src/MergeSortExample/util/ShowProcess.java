package MergeSortExample.util;

import MergeSortExample.model.Employee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class ShowProcess {

    private static String pattern = "dd/MM/yyyy";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

    public static void showValues(ArrayList<Employee> employeeList) {

        System.out.println("Employee List");

        for (Employee employee : employeeList) {

            String registerDate = dateFormat.format(employee.getRegisterDate());

            /*
            Date input = employee.getRegisterDate();
            LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            String registerDate = date.format(formatter);
            */

            System.out.println("ID : " + employee.getId() + " || "
                    + "NAME : " + employee.getName() + " || "
                    + "LASTNAME : " + employee.getLastname() + " || "
                    + "AGE : " + employee.getAge() + " || "
                    + "REGISTER DATE : " + registerDate
            );
        }
    }
}
