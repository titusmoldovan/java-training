package code._4_student_effort.ChallengeOne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 9, 6, 1, 4, 7, 8, 3, 0, 2, 1);
        List<Double> doubles = Arrays.asList(4.3, 9.0, 1.0, 7.0, 3.0, 3.6, 2.0, 0.0);
        Leaders leaders = new Leaders();

        System.out.println(leaders.getLeadersBySum(integers));
        System.out.println(leaders.getLeadersByRank(integers));
    }
}
