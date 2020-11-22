package code._4_student_effort;

import code._4_student_effort.challenge_1.NumberToWordCorrespondent;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        NumberToWordCorrespondent[] correspondentsData = {
                new NumberToWordCorrespondent(3, "Foo"),
                new NumberToWordCorrespondent(5, "Bar"),
                new NumberToWordCorrespondent(7, "Qix")
        };

        String s=compute(503,correspondentsData);
        String s1=compute(735,correspondentsData);
    }

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
            s+=replaceDigit(number,correspondent.getNumber(), correspondent.getWord());
        }


//        for (NumberToWordCorrespondent correspondent : correspondents) {
//            if (countDigits(number, correspondent.getNumber()) != 0) {
//                isChanged = true;
//                for (int i = 0; i < countDigits(number, correspondent.getNumber()); i++) {
//                    s += correspondent.getWord();
//                }
//            }
//        }

        if(!isChanged) {
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

    private static String replaceDigit(int number, int digit, String replace) {

        int reversed = reverseNumber(number);
        String s = "";

        while (reversed != 0) {
            if (reversed % 10 == digit)
                s += replace;

            reversed = reversed / 10;
        }

        return s;
    }

    private static int reverseNumber(int num) {

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
