package code._4_student_effort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private final String fileName;

    public WriteToFile(String fileName) {
        this.fileName = fileName;
    }

    public void writeText(String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.fileName))){
            bufferedWriter.write(text);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
