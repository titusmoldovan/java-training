package code._4_student_effort.ChallengeFour;

import java.io.*;
import java.util.HashMap;

public class NumberLCD {

    private static final String  input = "_4_exceptions_io/_test_files/in/input_number.txt";
    private static final String  output = "_4_exceptions_io/_test_files/out/output_number.txt";
    private static final HashMap<String, int[][]> digitalNumbers;

    static {
        int[][] zero = {{1, 1, 1}, {1, 0, 1}, {0, 1, 0}};
        int[][] one = {{0, 0, 1}, {0, 0, 1}, {0, 0, 0}};
        int[][] two = {{1, 1, 0}, {0, 1, 1}, {0, 1, 0}};
        int[][] three = {{0, 1, 1}, {0, 1, 1}, {0, 1, 0}};
        int[][] four = {{0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] five = {{0, 1, 1}, {1, 1, 0}, {0, 1, 0}};
        int[][] six = {{1, 1, 1}, {1, 1, 0}, {0, 1, 0}};
        int[][] seven = {{0, 0, 1}, {0, 0, 1}, {0, 1, 0}};
        int[][] eight = {{1, 1, 1}, {1, 1, 1}, {0, 1, 0}};
        int[][] nine = {{0, 1, 1}, {1, 1, 1}, {0, 1, 0}};
        digitalNumbers = new HashMap<>();
        digitalNumbers.put("0", zero);
        digitalNumbers.put("1", one);
        digitalNumbers.put("2", two);
        digitalNumbers.put("3", three);
        digitalNumbers.put("4", four);
        digitalNumbers.put("5", five);
        digitalNumbers.put("6", six);
        digitalNumbers.put("7", seven);
        digitalNumbers.put("8", eight);
        digitalNumbers.put("9", nine);
    }

    public static void main(String[] args) {

        convertFiles(input, output);
    }

    private static void convertFiles(String inputPath, String outputPath) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {

            String line = br.readLine();
            while (line != null) {
                bw.write(convertToLCD(line, 0, 0));
                line = br.readLine();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    private static String convertToLCD(String number, int width, int height) {
        StringBuilder sb = new StringBuilder();
        char[] numbers = number.toCharArray();
        for (int k = 0; k < numbers.length; k++) {
            int[][] lcdNum = digitalNumbers.get(String.valueOf(numbers[k]));
            for (int i = lcdNum.length - 1; i >= 0; i--) {
                for (int j = 0; j < lcdNum[i].length; j++) {
                    if (lcdNum[i][j] == 1) {
                        switch (j) {
                            case 0, 2 -> sb.append("|");
                            case 1 -> sb.append("_");
                        }
                    } else {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
