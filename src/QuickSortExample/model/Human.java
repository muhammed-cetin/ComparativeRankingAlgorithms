package QuickSortExample.model;

import java.io.Serializable;
import java.util.Date;

public class Human implements Serializable {
    private long id;
    private String name;
    private String lastname;
    private int age;
    private Date registerDate;

    public Human() {
    }

    public Human(long id, String name, String lastname, int age, Date registerDate) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.registerDate = registerDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

}
