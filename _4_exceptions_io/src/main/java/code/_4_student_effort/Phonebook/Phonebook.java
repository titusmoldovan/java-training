package code._4_student_effort.Phonebook;

import java.io.FileInputStream;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {



        try{
            FileInputStream input = new FileInputStream("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Phonebook\\Phonebook.txt");
            Scanner reader = new Scanner(input);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
            //    System.out.println(data);
                if(data.contains("Abbey") || data.contains("Abdul")){
                    System.out.println(data);
                }
            }
        }
        catch (Exception e){
            System.out.println("Thing does not exist in file!");
            e.printStackTrace();
        }

    }

}
