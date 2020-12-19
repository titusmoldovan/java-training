package code._4_student_effort.challenge1_phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Person> readFile() {

        List<Person> persons = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] arr = line.split(" ", 2);
                Person person = new Person(arr[0], arr[1]);
                persons.add(person);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }
}
