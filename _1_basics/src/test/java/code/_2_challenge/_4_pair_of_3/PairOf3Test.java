package code._2_challenge._4_pair_of_3;

import code._4_student_effort.challenge_4.Challenge4;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf3Test {
    public static Map<Integer[], Integer> data = Map.ofEntries(
            entry(new Integer[]{-1, -1, -1, 2}, 1)
    );

    @org.junit.Test
    public void test() {
        PairOf3 PairOf3 = new PairOf3();
        for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
            Integer[] input = entry.getKey();
            Integer expected = entry.getValue();
            Integer actual = PairOf3.countPairs(input, 0);
            Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
        }
    }

    @org.junit.Test
    public void myTest() {
        Challenge4 challenge4 = new Challenge4();

        List<Integer> test = new ArrayList<>();
        test.add(-1);
        test.add(-1);
        test.add(-1);
        test.add(2);
        test.add(2);
        test.add(-2);
        test.add(0);

        List<Integer> input = test;
        Integer expected = 2;
        Integer actual = Challenge4.countPairOfThree(input);
        Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);

    }
}