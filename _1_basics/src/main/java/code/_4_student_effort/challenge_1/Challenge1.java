package code._4_student_effort.challenge_1;

public class Challenge1 {

    public static String getCorrespondentWordForNumber(int i, NumberToWordCorrespondent[] correspondents) {

        String s = "";

        boolean isDivisible = false;
        for (NumberToWordCorrespondent numberToWordCorrespondent : correspondents) {
            if (i % numberToWordCorrespondent.getNumber() == 0) {
                isDivisible = true;
                s += numberToWordCorrespondent.getWord();
            }
        }

        if (!isDivisible) {
            s = String.valueOf(i);
        }

        return s;
    }


}
