package QuickSortExample.util;

import QuickSortExample.model.Human;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DefineValuesHuman {

    public static ArrayList<Human> defineValues(ArrayList<Human> humanList) throws ParseException {

        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        Human human1 = new Human();
        human1.setId(25);
        human1.setName("Muhammed");
        human1.setLastname("Cetin");
        human1.setAge(24);
        human1.setRegisterDate(dateFormat.parse("01/01/2024"));

        Human human2 = new Human();
        human2.setId(3);
        human2.setName("Ali");
        human2.setLastname("Cabbar");
        human2.setAge(21);
        human2.setRegisterDate(dateFormat.parse("02/01/2024"));

        Human human3 = new Human();
        human3.setId(1);
        human3.setName("Ekrem");
        human3.setLastname("Enes");
        human3.setAge(25);
        human3.setRegisterDate(dateFormat.parse("03/01/2024"));

        Human human4 = new Human();
        human4.setId(17);
        human4.setName("Ahmet");
        human4.setLastname("As");
        human4.setAge(30);
        human4.setRegisterDate(dateFormat.parse("04/01/2024"));

        Human human5 = new Human();
        human5.setId(43);
        human5.setName("Duru");
        human5.setLastname("Demir");
        human5.setAge(28);
        human5.setRegisterDate(dateFormat.parse("05/01/2024"));

        Human human6 = new Human();
        human6.setId(5);
        human6.setName("Kardelen");
        human6.setLastname("Kara");
        human6.setAge(27);
        human6.setRegisterDate(dateFormat.parse("06/01/2024"));

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);
        humanList.add(human6);

        return humanList;
    }
}
