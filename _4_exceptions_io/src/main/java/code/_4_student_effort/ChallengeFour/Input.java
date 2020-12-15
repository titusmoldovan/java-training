package code._4_student_effort.ChallengeFour;

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

    public String getInput() throws IOException {
        StringBuilder builder = new StringBuilder();
        String input = getReader().readLine();
        while (input != null) {
            builder.append(input);
            input = getReader().readLine();
        }
        if (getReader() != null) {
            getReader().close();
        }
        return builder.toString();
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
}
