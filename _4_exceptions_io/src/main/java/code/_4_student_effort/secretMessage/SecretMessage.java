package code._4_student_effort.secretMessage;

import java.lang.Character;

public class SecretMessage {
    private final String initialMessage;

    public SecretMessage(String initialMessage) {
        this.initialMessage = initialMessage;
    }

    public String decodeMessage() {
        StringBuilder decodedMessage = new StringBuilder();
        for (char character : this.initialMessage.toCharArray()) {
            if (Character.isUpperCase(character)) {
                if (character == 'X')
                    decodedMessage.append(' ');
                else
                    decodedMessage.append(character);
            }
        }
        return decodedMessage.toString();
    }
}
