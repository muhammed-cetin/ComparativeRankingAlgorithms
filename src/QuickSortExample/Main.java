package QuickSortExample;

import QuickSortExample.model.Human;
import QuickSortExample.quicksort.QuickSortHuman;
import QuickSortExample.util.DefineValuesHuman;
import QuickSortExample.util.ShowProcessHuman;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Human> humanList = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        humanList = DefineValuesHuman.defineValues(humanList);

        System.out.println("---------------------------------");
        System.out.println("BEFORE QUICK SORT HumanList");
        ShowProcessHuman.showValues(humanList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER QUICK SORT sortById");
        QuickSortHuman.sortById(humanList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER QUICK SORT sortByName");
        QuickSortHuman.sortByName(humanList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER QUICK SORT sortByLastName");
        QuickSortHuman.sortByLastName(humanList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER QUICK SORT sortByAge");
        QuickSortHuman.sortByAge(humanList);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("AFTER QUICK SORT sortByRegisterDate");
        QuickSortHuman.sortByRegisterDate(humanList);
        System.out.println("---------------------------------");
    }
}
