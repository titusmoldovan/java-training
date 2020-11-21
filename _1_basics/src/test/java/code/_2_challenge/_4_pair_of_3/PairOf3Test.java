package code._2_challenge._4_pair_of_3;

import code._4_student_effort.ChallengeFour.PairOf3;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf3Test {
  public static Map<Integer[], Integer> data = Map.ofEntries(
          entry(new Integer[]{-1, -1, -1, 2}, 1),
          entry(new Integer[]{2,3,-5,1,2,-3},2),
          entry(new Integer[]{9,1,-4,-5,3,-4},2),
          entry(new Integer[]{8,3,0,-3,2,-10},2),
          entry(new Integer[]{1,2,1,3,-3,0},1)
  );

  @org.junit.Test
  public void test() {
    code._4_student_effort.ChallengeFour.PairOf3 PairOf3 = new PairOf3();
    for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
      Integer[] input = entry.getKey();
      Integer expected = entry.getValue();
      Integer actual = PairOf3.countPairs(input, 0);
      Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
    }
  }
}