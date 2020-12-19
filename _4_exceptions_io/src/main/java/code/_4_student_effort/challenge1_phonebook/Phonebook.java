package code._4_student_effort.challenge1_phonebook;

import java.util.List;
import java.util.Optional;

public class Phonebook {

    public static void main(String[] args) {

        Reader reader = new Reader("phonebook.txt");

        System.out.println(findPhoneNumber(reader.readFile(), "Abbey"));
        System.out.println(findPhoneNumber(reader.readFile(), "Abdul"));

    }

    private static String findPhoneNumber(List<Person> persons, String name) {

        Optional<Person> person = persons.stream().filter(p -> p.getName().equals(name)).findFirst();

        if (!person.isPresent()) {
            return "The phone number of " + name + " is not found";
        }

        return person.get().getPhoneNumber();
    }

}
