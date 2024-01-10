package SelectionSortExample.selectionsort;

import SelectionSortExample.model.Person;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;


public class SelectionSortPerson {


    public static Person[] sortById(ArrayList<Person> personList) {
        Person[] persons = personList.toArray(new Person[personList.size()]);
        for (int i = 0; i < persons.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < persons.length; j++) {
                if ((new Long(persons[j].getId()).compareTo(persons[minIndex].getId())) < 0) {
                    minIndex = j;
                }
                if (i != minIndex) {
                    Person tmp = persons[i];
                    persons[i] = persons[minIndex];
                    persons[minIndex] = tmp;
                }
            }
        }
        return persons;
    }

    public static ArrayList<Person> sortByName(ArrayList<Person> personList) {

        Comparator<Person> compTr = (p0, p1) -> {
            Collator collator = Collator.getInstance(new Locale("tr", "TR"));
            return collator.compare(p0.getName(), p1.getName());
        };

        Person[] persons = personList.toArray(new Person[personList.size()]);

        for (int i = 0; i < persons.length - 1; i++) {
            Person min = persons[i];
            int minId = i;
            for (int j = i+1; j < persons.length; j++) {
                if (!(greaterThan(compTr, persons[j], persons[minId]))) {
                    min = persons[j];
                    minId = j;
                }
            }
            // swapping
            Person tmp = persons[i];
            persons[i] = persons[minId];
            persons[minId] = tmp;
        }

        personList = new ArrayList<>(Arrays.asList(persons));
        return personList;
    }

    public static ArrayList<Person> sortByLastName(ArrayList<Person> personList) {

        Comparator<Person> compTr = (p0, p1) -> {
            Collator collator = Collator.getInstance(new Locale("tr", "TR"));
            return collator.compare(p0.getLastname(), p1.getLastname());
        };

        Person[] persons = personList.toArray(new Person[personList.size()]);

        for (int i = 0; i < persons.length - 1; i++) {
            Person min = persons[i];
            int minId = i;
            for (int j = i+1; j < persons.length; j++) {
                if (!(greaterThan(compTr, persons[j], persons[minId]))) {
                    min = persons[j];
                    minId = j;
                }
            }
            // swapping
            Person tmp = persons[i];
            persons[i] = persons[minId];
            persons[minId] = tmp;
        }
        personList = new ArrayList<>(Arrays.asList(persons));
        return personList;
    }


    public static Person[] sortByAge(ArrayList<Person> personList) {
        Person[] persons = personList.toArray(new Person[personList.size()]);

        for (int i = 0; i < persons.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < persons.length; j++) {
                if (((new Integer(persons[j].getAge()).compareTo(persons[minIndex].getAge())) < 0))
                    minIndex = j;

                if (i != minIndex) {
                    Person tmp = persons[i];
                    persons[i] = persons[minIndex];
                    persons[minIndex] = tmp;
                }
            }
        }
        return persons;
    }

    private static boolean greaterThan(Comparator comp, Person x, Person y) {
        return comp.compare(x, y) > 0;
    }
}
