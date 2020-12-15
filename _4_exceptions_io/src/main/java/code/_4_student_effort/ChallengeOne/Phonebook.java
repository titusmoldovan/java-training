package code._4_student_effort.ChallengeOne;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    private String name;
    private Map<String,String> phoneBook;

    public Phonebook(String name,Map phoneBook) {
        this.name = name;
        this.phoneBook = phoneBook;
    }

    public Phonebook(String name) {
        this.name = name;
    }

    //scan until found the username. Works better for one request.
    public void getPhoneOptimized(String username, Scanner scanner) throws FileNotFoundException {
        boolean found = false;
        while (scanner.hasNext() && found == false) {
            if (scanner.next().equals(username)) {
                found = true;
                String phoneNumber = scanner.next();
                System.out.println(username + ": " + phoneNumber);
            }
        }
    }
    public void getPhoneNumber(String username) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(username)) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
