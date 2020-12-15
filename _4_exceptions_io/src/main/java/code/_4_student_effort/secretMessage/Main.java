package code._4_student_effort.secretMessage;

import code._4_student_effort.ReadFromFile;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile("_4_exceptions_io/_test_files/in/message.txt");
        SecretMessage secretMessage = new SecretMessage(readFromFile.getText());
        System.out.println(secretMessage.decodeMessage());
    }
}
