package code._4_student_effort.challenge3_anagram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void writeAnagramsToFile(List<String> data) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (String str : data) {
                writer.write(str + System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
