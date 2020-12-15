package code._4_student_effort.ChallengeOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    private static String inputPath;
    private Map<String, String> phoneBook;

    public Input(String inputPath) {
        this.inputPath = inputPath;
        phoneBook = new HashMap<>();
    }

    public static Scanner getScanner() throws FileNotFoundException {
        if (scanner == null) {
            synchronized (Scanner.class) {
                if (scanner == null) {
                    scanner = new Scanner(new BufferedReader(new FileReader(inputPath)));
                }
            }
        }
        return scanner;
    }

    private void closeScanner(){
        if(scanner!=null){
            scanner.close();
        }
    }

    public void getInput() throws FileNotFoundException {
        while (getScanner().hasNextLine()) {
            phoneBook.put(getScanner().next(), getScanner().next());
        }
        closeScanner();
    }

    public static void setInputPath(String inputPath) {
        Input.inputPath = inputPath;
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }
}
