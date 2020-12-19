package code._4_student_effort.challenge5_occurence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public int countOccurenceOfWordInFile(String word) {

        int count = 0;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String[] arr = scanner.nextLine().split(" ", 6);
                for (String str : arr) {
                    if (str.equals(word))
                        count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }
}
