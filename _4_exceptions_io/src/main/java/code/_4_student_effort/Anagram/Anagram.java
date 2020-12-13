package code._4_student_effort.Anagram;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Anagram\\Anagram_Big_List.txt");
            FileWriter output = new FileWriter("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Anagram\\out.txt");
            Scanner scanner = new Scanner(input);
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (data.contains("l") && data.contains("i") && data.contains("s") && data.contains("t") && data.contains("e") && data.contains("n")){
                    if (data.length() == 6){
                        output.write(data);
                        output.write(" ");
                    }
                }
            }
            input.close();
            output.close();
        }
        catch (IOException e){
            System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
        }
    }

}
