package code._4_student_effort.challenge2_secretmessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Message getDecodedMessagefromFile() {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                char[] arr = line.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    if (Character.isUpperCase(arr[i]) && arr[i] != 'X') {
                        sb.append(arr[i]);
                    }

                    if (arr[i] == 'X') {
                        sb.append(" ");
                    }
                }
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Message decodedMessage = new Message(String.valueOf(sb));

        return decodedMessage;
    }
}
