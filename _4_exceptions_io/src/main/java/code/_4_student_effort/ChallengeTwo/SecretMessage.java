package code._4_student_effort.ChallengeTwo;

public class SecretMessage {

    private String encodedMessage;

    public SecretMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }

    public String decodeMessage() {
        StringBuilder ans = new StringBuilder();
        for (char c : this.encodedMessage.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ans.append(c);
            }
        }
        return new String(ans).replace("X", " ");
    }
}
