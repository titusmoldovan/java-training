package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ReadFromFile {
    private final String fileName;

    public ReadFromFile(String fileName) {
        this.fileName = fileName;
    }

    public String getText() {
        StringBuilder text = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(this.fileName)))) {
            scanner.useLocale(Locale.US);
            while (scanner.hasNext()) {
                text.append(scanner.next());
                text.append(" ");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return "";
        }
        return text.toString();
    }
}
