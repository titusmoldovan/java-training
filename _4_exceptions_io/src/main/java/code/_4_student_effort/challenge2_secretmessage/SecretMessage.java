package code._4_student_effort.challenge2_secretmessage;

public class SecretMessage {

    public static void main(String[] args) {
        Reader reader = new Reader("message.txt");

        System.out.println(reader.getDecodedMessagefromFile().getContent());
    }
}
