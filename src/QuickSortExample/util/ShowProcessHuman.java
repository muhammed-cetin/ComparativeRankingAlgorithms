package QuickSortExample.util;


import QuickSortExample.model.Human;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ShowProcessHuman {
    private static String pattern = "dd/MM/yyyy";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

    public static void showValues(ArrayList<Human> humanList) {

        System.out.println("Human List");

        for (Human human : humanList) {

            String registerDate = dateFormat.format(human.getRegisterDate());

            System.out.println("ID : " + human.getId() + " || "
                    + "NAME : " + human.getName() + " || "
                    + "LASTNAME : " + human.getLastname() + " || "
                    + "AGE : " + human.getAge() + " || "
                    + "REGISTER DATE : " + registerDate
            );
        }
    }
}
