package code._4_student_effort.Challenge1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static String inputPath = "C:\\Users\\Acer\\IdeaProjects\\java_training_2\\_4_exceptions_io\\_test_files\\in\\phonebook.txt";
    private static final HashMap<String, String> phoneBook = new HashMap<>();

    private static void getInput(String inputPath) {
        try (Scanner input = new Scanner(new BufferedReader(new FileReader(inputPath)))) {
            while (input.hasNextLine()) {
                phoneBook.put(input.next(), input.next());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void getPhoneNumber(String personName) {
        phoneBook.forEach((key, value) -> {
            if (key.equals(personName)) {
                System.out.print(value + "; ");
            }
        });
    }

    public static void main(String[] args) {
        getInput(inputPath);
        getPhoneNumber("Abbey");
        getPhoneNumber("Abdul");
    }
}
