package code._4_student_effort.Number_to_LCD;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Number_to_LCD {

    /* Stage 2 - in progress */

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Number_to_LCD\\in.txt");
            FileWriter out = new FileWriter("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Number_to_LCD\\out.txt");
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (data.equals("1")){
                    out.write(" " + "\n" + " " + " " + "|" + "\n" + " " + " " + "|" + "\n");
                    out.write("\n");
                }
                if (data.equals("2")){
                    out.write(" _" + "\n" + " " + "_" + "|" + "\n" + "|" + "_" + " " + "\n");
                    out.write("\n");
                }
                if (data.equals("3")){
                    out.write(" _" + "\n" + " " + "_" + "|" + "\n" + " " + "_" + "|" + "\n");
                    out.write("\n");
                }
                if (data.equals("4")){
                    out.write(" " + "\n" + "|" + "_" + "|" + "\n" + "  |" + "\n");
                    out.write("\n");
                }
                if (data.equals("5")){
                    out.write(" _" + "\n" + "|" + "_" + "\n" + " _" + "|" + "\n");
                    out.write("\n");
                }
                if (data.equals("6")){
                    out.write(" _" + "\n" + "|" + "_" + "\n" + "|" + "_" + "|" + "\n");
                    out.write("\n");
                }
                if (data.equals("7")){
                    out.write(" _" + "\n" + "  |" +"\n" + "  |" + "\n");
                    out.write("\n");
                }
                if (data.equals("8")){
                    out.write(" _" + "\n" + "|" + "_" + "|" + "\n" + "|" + "_" + "|" + "\n");
                    out.write("\n");
                }
                if (data.equals("9")){
                    out.write(" _" + "\n" + "|" + "_" + "|" + "\n" + " _" + "|" + "\n");
                    out.write("\n");
                }

            }
            in.close();
            out.close();
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

}
