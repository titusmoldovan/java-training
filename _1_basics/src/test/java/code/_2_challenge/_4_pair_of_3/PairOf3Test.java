package code._2_challenge._4_pair_of_3;

import code._4_student_effort.MyPairOf3;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf3Test {
  public static Map<Integer[], Integer> data = Map.ofEntries(
          entry(new Integer[]{-1, -1, -1, 2}, 1)
  );

  @org.junit.Test
  public void test() {
    MyPairOf3 PairOf3 = new MyPairOf3();
    for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
      Integer[] input = entry.getKey();
      Integer expected = entry.getValue();
      Integer actual = PairOf3.countPairs(input);
      Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
    }
  }
}