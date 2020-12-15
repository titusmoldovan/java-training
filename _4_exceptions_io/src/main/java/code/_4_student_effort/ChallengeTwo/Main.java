package code._4_student_effort.ChallengeTwo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Input input = new Input("_4_exceptions_io/_test_files/in/message.txt");
        String encodedMessage = input.getMessage();
        SecretMessage sm = new SecretMessage(encodedMessage);
        System.out.println(sm.decodeMessage());
    }
}
