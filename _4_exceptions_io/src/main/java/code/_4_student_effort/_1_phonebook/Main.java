package code._4_student_effort._1_phonebook;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    private static final String FILE_URL = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt";
    private static final String FILE_NAME = "fisier.txt";
    private static List<PhoneNumber> items = new ArrayList<>();

    public static void setItems(List<PhoneNumber> items) {
        Main.items = items;
    }

    public static void main(String[] args) {
        getData();
        setInitialItemsFromFile();

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(findCertainNumbers("Abbie"));
        phoneNumbers.add(findCertainNumbers("Abdul"));
        phoneNumbers.forEach(System.out::println);
    }

    public static String findCertainNumbers(String name) {
        return Objects.requireNonNull(items.stream().filter(phoneNumber -> phoneNumber.getName().equals(name)).findAny().orElse(null)).getPhoneNumber();
    }

    public static void getData() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void setInitialItemsFromFile() {
        try {
            List<String[]> lines = Files.lines(Paths.get("D:\\Munca\\Cursuri\\AtelierGoogle\\Curs1\\java-training\\fisier.txt"))
                    .map(line -> line.split(" "))
                    .collect(Collectors.toList());

            items = lines.stream()
                    .map(a -> new PhoneNumber(a[0], a[1]))
                    .collect(Collectors.toList());
            setItems(new ArrayList<>(items));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
