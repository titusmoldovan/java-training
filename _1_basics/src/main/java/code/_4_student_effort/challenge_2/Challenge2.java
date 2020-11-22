package code._4_student_effort.challenge_2;

import code._4_student_effort.challenge_1.NumberToWordCorrespondent;

import java.util.*;

public class Challenge2 {

    public static String compute(int number, NumberToWordCorrespondent[] correspondents) {

        String s = "";
        boolean isChanged = false;

        for (NumberToWordCorrespondent correspondent : correspondents) {
            if (number % correspondent.getNumber() == 0) {
                s += correspondent.getWord();
                isChanged = true;
            }
        }

        for (NumberToWordCorrespondent correspondent : correspondents) {
            if (countDigits(number, correspondent.getNumber()) != 0) {
                isChanged = true;
                for (int i = 0; i < countDigits(number, correspondent.getNumber()); i++) {
                    s += correspondent.getWord();
                }
            }
        }

        if (!isChanged) {
            return String.valueOf(number);
        }

        return s;

    }

    private static int countDigits(int number, int digit) {

        int count = 0;

        while (number != 0) {
            if (number % 10 == digit) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
