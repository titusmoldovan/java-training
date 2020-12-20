package code._4_student_effort.ChallengeFour;

import code._4_student_effort.ChallengeTwo.Boot;
import code._4_student_effort.ChallengeTwo.Running;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Boot[] boots = new Boot[5];
        Running[] runnings = new Running[5];

        for (int i = 0; i < 5; i++) {
            boots[i] = new Boot("green", new Random().nextInt(10) + 1);
            runnings[i] = new Running("yellow", new Random().nextInt(10) + 1);
        }
        Arrays.sort(boots);
        Arrays.sort(runnings);

        IArrayIterator<Boot> itBoots = new ArrayIterator<>(boots);
        IArrayIterator<Running> itRunnings = new ArrayIterator<>(runnings);

        while (itBoots.hasNext()) {
            System.out.println(itBoots.next() + " ");
        }
        while (itRunnings.hasNext()) {
            System.out.println(itRunnings.next() + " ");
        }

    }

}
