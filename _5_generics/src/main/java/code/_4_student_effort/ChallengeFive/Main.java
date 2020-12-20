package code._4_student_effort.ChallengeFive;

import code._4_student_effort.ChallengeTwo.Boot;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GenericBinarySearch binarySearch = new GenericBinarySearch();
        Boot[] boots = new Boot[10];
        for (int i = 0; i < 10; i++) {
            boots[i] = new Boot("green", new Random().nextInt(10) + 1);
        }

        Arrays.sort(boots);
        for (Boot boot : boots) {
            System.out.println(boot);
        }
        Boot boot = new Boot("green", 7);
        System.out.println(binarySearch.binarySearch(boots, boot));
    }
}