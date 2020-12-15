package code._4_student_effort.numberToLCD;

import java.util.HashMap;

/*
    _    1 2 3
   |_|   4 5 6
   |_|   7 8 9
 */

public class NumberToLCD {
    private final HashMap<Character, Integer[]> representations;

    public NumberToLCD() {
        this.representations = getRepresentation();
    }

    private HashMap<Character, Integer[]> getRepresentation() {
        HashMap<Character, Integer[]> representations = new HashMap<>();
        representations.put('1', new Integer[]{6, 9});
        representations.put('2', new Integer[]{2, 5, 6, 7, 8});
        representations.put('3', new Integer[]{2, 5, 6, 8, 9});
        representations.put('4', new Integer[]{4, 5, 6, 9});
        representations.put('5', new Integer[]{2, 4, 5, 8, 9});
        representations.put('6', new Integer[]{2, 4, 5, 7, 8, 9});
        representations.put('7', new Integer[]{2, 6, 9});
        representations.put('8', new Integer[]{2, 4, 5, 6, 7, 8, 9});
        representations.put('9', new Integer[]{2, 4, 5, 6, 8, 9});
        return representations;
    }

    private boolean contains(Integer[] array, int number) {
        for (int element : array)
            if (element == number)
                return true;
        return false;
    }

    public String getBasicLCD(String number) {
        number = number.strip();
        StringBuilder LCD = new StringBuilder();
        for (int level = 1; level < 4; level++) {
            for (char character : number.toCharArray()) {
                int position = level * 3 - 2;
                for (int i = 0; i < 3; i++) {
                    if (this.contains(this.representations.get(character), position)) {
                        if (position == 2 || position == 5 || position == 8) {
                            LCD.append('_');
                        } else
                            LCD.append('|');
                    } else
                        LCD.append(' ');
                    position++;
                }
            }
            LCD.append("\n");
        }
        return LCD.toString();
    }

    private void addLevels(String number, int width, int height, StringBuilder LCD, int startPosition) {
        while (height / 2 > 1) {
            for (char character : number.toCharArray()) {
                for (int position = startPosition; position <= startPosition+2; position++) {
                    if (this.contains(this.representations.get(character), position)) {
                        if (position == startPosition+1)
                            LCD.append(" ".repeat(Math.max(0, width)));
                        else
                            LCD.append("|");
                    } else
                        LCD.append(" ");
                }
            }
            height -= 2;
            LCD.append("\n");
        }
    }

    public String getCustomLCD(String number, int width, int height) {
        number = number.strip();
        StringBuilder LCD = new StringBuilder();
        for (int level = 1; level < 4; level++) {
            for (char character : number.toCharArray()) {
                int position = level * 3 - 2;
                for (int i = 0; i < 3; i++) {
                    if (this.contains(this.representations.get(character), position)) {
                        if (position == 2 || position == 5 || position == 8) {
                            LCD.append("_".repeat(Math.max(0, width)));
                        } else
                            LCD.append('|');
                    } else
                        LCD.append(" ");
                    position++;
                }
            }
            LCD.append("\n");
            if (level == 1)
                addLevels(number, width, height, LCD, 4);
            if (level == 2)
                addLevels(number, width, height, LCD, 7);
        }
        return LCD.toString();
    }
}
