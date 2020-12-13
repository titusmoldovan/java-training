package code._4_student_effort.Challenge4;

import java.io.*;
import java.util.HashMap;

public class NumberToLCDVersion1 {
    public static String inputPath = "C:\\Users\\Acer\\IdeaProjects\\java_training_2\\_4_exceptions_io\\_test_files\\in\\input_number.txt";
    public static String outputPath = "C:\\Users\\Acer\\IdeaProjects\\java_training_2\\_4_exceptions_io\\_test_files\\out\\output_number.txt";

    private static final String blank = "   ";
    private static final String bottom = " _ ";
    //private static final String left = "|  ";
    private static final String right = "  |";
    private static final String both = "| |";
    private static final String leftBottom = "|_ ";
    private static final String rightBottom = " _|";
    private static final String leftRightBottom = "|_|";
    public static HashMap<Character, String[]> digitsOfNumber;

    static {
        digitsOfNumber = new HashMap<>();

        digitsOfNumber.put('0', new String[]{bottom, both, leftRightBottom});
        digitsOfNumber.put('1', new String[]{blank, right, right});
        digitsOfNumber.put('2', new String[]{bottom, rightBottom, leftBottom});
        digitsOfNumber.put('3', new String[]{bottom, rightBottom, rightBottom});
        digitsOfNumber.put('4', new String[]{blank, leftRightBottom, right});
        digitsOfNumber.put('5', new String[]{bottom, leftBottom, rightBottom});
        digitsOfNumber.put('6', new String[]{bottom, leftBottom, leftRightBottom});
        digitsOfNumber.put('7', new String[]{bottom, right, right});
        digitsOfNumber.put('8', new String[]{bottom, leftRightBottom, leftRightBottom});
        digitsOfNumber.put('9', new String[]{bottom, leftRightBottom, rightBottom});
    }

    private static String toLCD(String number) {
        StringBuilder numberToLCD = new StringBuilder();
        char[] digits = number.toCharArray();
        for (int i = 0; i < 3; i++) {
            for (char digit : digits) {
                numberToLCD.append(digitsOfNumber.get(digit)[i]);
            }
            numberToLCD.append("\n");
        }
        return numberToLCD.toString();
    }

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            String number = reader.readLine();
            if (number != null) {
                writer.write(toLCD(number));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
