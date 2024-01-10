package SelectionSortExample.util;

import SelectionSortExample.model.Person;

import java.util.ArrayList;

public class ShowProcessPerson {

    public static void showValues(ArrayList<Person> personList) {
        System.out.println("Person List");
        for (Person person : personList) {
            System.out.println("ID : " + person.getId() + " || "
                    + "NAME : " + person.getName() + " || "
                    + "LASTNAME : " + person.getLastname() + " || "
                    + "AGE : " + person.getAge());
        }
    }
}
