package code._4_student_effort.numberToLCD;

import code._4_student_effort.ReadFromFile;
import code._4_student_effort.WriteToFile;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile("_4_exceptions_io/_test_files/in/input_number.txt");
        WriteToFile writeToFile1 = new WriteToFile("_4_exceptions_io/src/main/java/code/_4_student_effort/numberToLCD/numberToLCDBasic.txt");
        WriteToFile writeToFile2 = new WriteToFile("_4_exceptions_io/src/main/java/code/_4_student_effort/numberToLCD/numberToLCDCustom.txt");
        NumberToLCD numberToLCD = new NumberToLCD();
        writeToFile1.writeText(numberToLCD.getBasicLCD(readFromFile.getText()));
        writeToFile2.writeText(numberToLCD.getCustomLCD(readFromFile.getText(), 3, 5));
    }
}
