package code._4_student_effort.challenge1_phonebook;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class Person implements Serializable {

    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
