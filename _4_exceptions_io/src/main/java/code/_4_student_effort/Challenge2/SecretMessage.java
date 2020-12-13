package code._4_student_effort.Challenge2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {
    public static String inputPath = "C:\\Users\\Acer\\IdeaProjects\\java_training_2\\_4_exceptions_io\\_test_files\\in\\message.txt";

    private static void getSecretMessage(String inputPath) {
        StringBuilder message = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            int c = reader.read();
            while (c >= 0) {
                char character = (char) c;
                if (Character.isUpperCase(character)) {
                    message.append(character);
                }
                c = reader.read();
            }
            String finalMessage = new String(message).replace("X", " ");
            System.out.println(finalMessage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getSecretMessage(inputPath);
    }
}
