package code._4_student_effort.Secret_Message;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Secret_Message {

    public static void main(String[] args) {

        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        try {
            FileInputStream input = new FileInputStream("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Secret_Message\\Secret_Message.txt");
            Scanner scanner = new Scanner(input);
            while (scanner.hasNext()){
                String data = scanner.next();
                for (String letter : letters) {
                    if (data.contains(letter)) {
                        if (letter.equals("X")) {
                            System.out.print(" ");
                        } else
                            System.out.print(letter);
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
    }

}
