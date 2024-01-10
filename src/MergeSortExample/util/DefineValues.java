package MergeSortExample.util;

import MergeSortExample.model.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DefineValues {
    /*
        2022-01-01" tarihini biçimlendirmeye çalıştığımızda, SimpleDateFormat sınıfının beklenen biçimine ("dd/MM/yyyy")
        uymadığı için bir ParseException oluşabilir.
     */
    public static ArrayList<Employee> defineValues(ArrayList<Employee> employeeList) throws ParseException {

        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        Employee employee1 = new Employee();
        employee1.setId(25);
        employee1.setName("Muhammed");
        employee1.setLastname("Çetin");
        employee1.setAge(24);
        employee1.setRegisterDate(dateFormat.parse("01/01/2024"));

        Employee employee2 = new Employee();
        employee2.setId(3);
        employee2.setName("Ali");
        employee2.setLastname("Cabbar");
        employee2.setAge(21);
        employee2.setRegisterDate(dateFormat.parse("02/01/2024"));

        Employee employee3 = new Employee();
        employee3.setId(1);
        employee3.setName("Ekrem");
        employee3.setLastname("Enes");
        employee3.setAge(25);
        employee3.setRegisterDate(dateFormat.parse("03/01/2024"));

        Employee employee4 = new Employee();
        employee4.setId(17);
        employee4.setName("Ahmet");
        employee4.setLastname("As");
        employee4.setAge(30);
        employee4.setRegisterDate(dateFormat.parse("04/01/2024"));

        Employee employee5 = new Employee();
        employee5.setId(43);
        employee5.setName("Duru");
        employee5.setLastname("Demir");
        employee5.setAge(28);
        employee5.setRegisterDate(dateFormat.parse("05/01/2024"));

        Employee employee6 = new Employee();
        employee6.setId(5);
        employee6.setName("Kardelen");
        employee6.setLastname("Kara");
        employee6.setAge(27);
        employee6.setRegisterDate(dateFormat.parse("06/01/2024"));

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        return employeeList;
    }
}
