package code._4_student_effort.ChallengeTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {


    public static void main(String[] args) {
        String inputPath = "_4_exceptions_io/_test_files/in/message.txt";
        SecretMessage sm = new SecretMessage();
        sm.getSecretMessage(inputPath);
    }

    private void getSecretMessage(String inputPath) {
        StringBuilder ans = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            int c = reader.read();
            while (c != -1) {
                char character = (char) c;
                if (Character.isUpperCase(character)) {
                    ans.append(character);
                }
                c = reader.read();
            }
            String finalString = new String(ans).replace("X", " ");
            System.out.println(finalString);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
