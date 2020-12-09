package code._4_student_effort.ChallengeOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    public static final String inputPath = "_4_exceptions_io/_test_files/in/phonebook.txt";
    private static Map<String, String> phoneBook = new HashMap<>();

    static {
        getInput();
    }

    public static void main(String[] args) {
        getPhoneNumber("Abbey");
        getPhoneNumber("Abdul");
    }

    //scan everything and store in a hashmap. Works better if multiple requests.
    private static void getInput() {
        try (Scanner input = new Scanner(new BufferedReader(new FileReader(inputPath)))) {
            while (input.hasNextLine()) {
                phoneBook.put(input.next(), input.next());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //scan until found the username. Works better for one request.
    private static void getPhoneOptimized(String username) {
        try (Scanner input = new Scanner(new BufferedReader(new FileReader(inputPath)))) {
            boolean found = false;
            while (input.hasNext() && found == false) {
                if (input.next().equals(username)) {
                    found = true;
                    String phoneNumber = input.next();
                    System.out.println(username + ": " + phoneNumber);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void getPhoneNumber(String username) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(username)) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
