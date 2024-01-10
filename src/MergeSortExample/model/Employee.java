package MergeSortExample.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

    private long id;
    private String name;
    private String lastname;
    private int age;
    private Date registerDate;

    public Employee() {

    }

    public Employee(long id, String name, String lastname, int age, Date registerDate) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", registerDate=" + registerDate +
                '}';
    }
}
