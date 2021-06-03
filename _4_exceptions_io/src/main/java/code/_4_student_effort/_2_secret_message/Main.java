package code._4_student_effort._2_secret_message;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {

    public static byte[] dataBuffer = new byte[1024];

    private static final String FILE_URL = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/message.txt";
    private static final String FILE_NAME = "fisier.txt";

    public static void main(String[] args) {
        setFileContent();
        String string = new String(dataBuffer, StandardCharsets.UTF_8);
        StringBuilder output = new StringBuilder();
        for (Character character : string.toCharArray()) {
            if (manipulateChar(character) != null) {
                output.append(manipulateChar(character));
            }
        }
        System.out.println(output);
    }

    private static Character manipulateChar(Character character) {
        if (Character.isUpperCase(character)) {
            if (character == 'X')
                return ' ';
            else return character;
        }
        return null;
    }

    public static void setFileContent() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
