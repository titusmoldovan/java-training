package code._4_student_effort.ChallengeFour;

import java.util.HashMap;

public class Converter {
    private static final HashMap<String, int[][]> digitalNumbers;
    private String message;

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

    public Converter(String message) {
        this.message = message;
    }

    public String getLCDNumber() {
        StringBuilder sb = new StringBuilder();
        char[] numbers = message.toCharArray();
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
