package code._4_student_effort.SecretMessage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretMessage {
    public static void main(String[] args) throws IOException {
        String secretMessage;
        List<Character> partOfMessage = new ArrayList<>();
        getCorrectChars(partOfMessage);
        StringBuilder aux = new StringBuilder();
        for (Character ch : partOfMessage)
            aux.append(ch);
        secretMessage = String.valueOf(aux);
        System.out.println(secretMessage);
    }

    static void getCorrectChars(List<Character> partOfMessage) throws IOException {
        FileReader inputStream = null;
        try {
            inputStream = new FileReader("_4_exceptions_io/_test_files/in/message.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                Character auxChar = (char) c;
                if (Character.isUpperCase(auxChar) && 'X' != auxChar )
                    partOfMessage.add(auxChar);
                if ('X' == auxChar)
                    partOfMessage.add(' ');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                inputStream.close();
        }
    }

}
