package SelectionSortExample;

import SelectionSortExample.model.Person;
import SelectionSortExample.selectionsort.SelectionSortPerson;
import SelectionSortExample.util.DefineValuesPerson;
import SelectionSortExample.util.ShowProcessPerson;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<Person> personList = new ArrayList<>();
    private static ArrayList<Person> sortedpersonList = new ArrayList<>();

    public static void main(String[] args) {

        personList = DefineValuesPerson.defineValues(personList);


        System.out.println("---------------------------------");
        System.out.println("BEFORE SELECTION SORT");
        ShowProcessPerson.showValues(personList);

        System.out.println("---------------------------------");
        Person[] personsById = SelectionSortPerson.sortById(personList);
        sortedpersonList = new ArrayList<>(Arrays.asList(personsById));
        System.out.println("AFTER SELECTION SORT sortById");
        ShowProcessPerson.showValues(sortedpersonList);
        System.out.println("---------------------------------\n");

        System.out.println("---------------------------------\n");
        sortedpersonList = SelectionSortPerson.sortByName(personList);
        System.out.println("AFTER SELECTION SORT sortByName");
        ShowProcessPerson.showValues(sortedpersonList);
        System.out.println("---------------------------------\n");

        System.out.println("---------------------------------\n");
        sortedpersonList = SelectionSortPerson.sortByLastName(personList);
        System.out.println("AFTER SELECTION SORT byLastName");
        ShowProcessPerson.showValues(sortedpersonList);
        System.out.println("---------------------------------\n");

        System.out.println("---------------------------------\n");
        Person[] personsByAge = SelectionSortPerson.sortByAge(personList);
        sortedpersonList = new ArrayList<>(Arrays.asList(personsByAge));
        System.out.println("AFTER SELECTION SORT byAge");
        ShowProcessPerson.showValues(sortedpersonList);
        System.out.println("---------------------------------\n");
    }
}
