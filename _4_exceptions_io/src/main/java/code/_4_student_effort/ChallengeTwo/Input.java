package code._4_student_effort.ChallengeTwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {

    private static BufferedReader reader;
    private static String inputPath;

    public Input(String inputPath) {
        this.inputPath = inputPath;
    }

    public String getMessage() throws IOException {
        StringBuilder sb = new StringBuilder();
        String line = getReader().readLine();
        while (line != null) {
            sb.append(line);
            line = getReader().readLine();
        }
        if (getReader() != null) {
            getReader().close();
        }
        return sb.toString();
    }

    public static BufferedReader getReader() throws FileNotFoundException {
        if (reader == null) {
            synchronized (BufferedReader.class) {
                if (reader == null) {
                    reader = new BufferedReader(new FileReader(inputPath));
                }
            }
        }
        return reader;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }
}
