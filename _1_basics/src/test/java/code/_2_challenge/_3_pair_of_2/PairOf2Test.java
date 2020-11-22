package code._2_challenge._3_pair_of_2;

import code._4_student_effort.challenge_3.Challenge3;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf2Test {
    public static Map<Integer[], Integer> data = Map.ofEntries(
            entry(new Integer[]{3, 2, -3, -2, 3, 0}, 2),
            entry(new Integer[]{1, 1, 0, -1, -1}, 2),
            entry(new Integer[]{5, 9, -5, 7, -5}, 1)
    );

    @org.junit.Test
    public void test() {
        PairOf2 PairOf2 = new PairOf2();
        for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
            Integer[] input = entry.getKey();
            Integer expected = entry.getValue();
            Integer actual = PairOf2.countPairs(input);
            Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
        }
    }

    @org.junit.Test
    public void myTest() {
        Challenge3 challenge3 = new Challenge3();
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(2);
        test.add(-3);
        test.add(9);
        test.add(-2);
        test.add(2);
        test.add(-9);
        test.add(-2);
        test.add(3);
        test.add(0);
        test.add(0);

        List<Integer> input = test;
        Integer expected = 5;
        Integer actual = Challenge3.countPairOfTwo(input);
        Assert.assertEquals("for input: " + input, expected, actual);
    }
}
