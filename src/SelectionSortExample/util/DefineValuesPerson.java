package SelectionSortExample.util;

import SelectionSortExample.model.Person;

import java.util.ArrayList;

public class DefineValuesPerson {

    public static ArrayList<Person> defineValues(ArrayList<Person> personList) {

        Person person1 = new Person();
        person1.setId(5);
        person1.setName("Muhammed");
        person1.setLastname("Cetin");
        person1.setAge(24);

        Person person2 = new Person();
        person2.setId(1);
        person2.setName("Gizem");
        person2.setLastname("Fatma");
        person2.setAge(25);

        Person person3 = new Person();
        person3.setId(4);
        person3.setName("Dilara");
        person3.setLastname("Mert");
        person3.setAge(20);

        Person person4 = new Person();
        person4.setId(2);
        person4.setName("Ali");
        person4.setLastname("Yagmur");
        person4.setAge(16);

        Person person5 = new Person();
        person5.setId(6);
        person5.setName("Pelin");
        person5.setLastname("Oki");
        person5.setAge(30);

        Person person6 = new Person();
        person6.setId(3);
        person6.setName("Devran");
        person6.setLastname("Hap");
        person6.setAge(27);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        return personList;
    }
}
