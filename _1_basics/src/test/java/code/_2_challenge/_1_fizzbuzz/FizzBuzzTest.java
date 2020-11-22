package code._2_challenge._1_fizzbuzz;

import code._4_student_effort.challenge_1.Challenge1;
import code._4_student_effort.challenge_1.NumberToWordCorrespondent;
import org.junit.Assert;

import java.util.Map;

import static java.util.Map.entry;

public class FizzBuzzTest {
  public static Map<Integer, String> stage1 = Map.ofEntries(
          entry(1, "1"),
          entry(2, "2"),
          entry(3, "Fizz"),
          entry(4, "4"),
          entry(5, "Buzz"),
          entry(6, "Fizz"),
          entry(7, "7"),
          entry(8, "8"),
          entry(9, "Fizz"),
          entry(10, "Buzz"),
          entry(13, "13"),
          entry(14, "14"),
          entry(15, "FizzBuzz"),
          entry(16, "16"),
          entry(17, "17"),
          entry(18, "Fizz"),
          entry(19, "19"),
          entry(20, "Buzz"),
          entry(21, "Fizz"),
          entry(22, "22"),
          entry(23, "23"),
          entry(24, "Fizz"),
          entry(25, "Buzz"),
          entry(26, "26"),
          entry(27, "Fizz"),
          entry(28, "28"),
          entry(29, "29"),
          entry(30, "FizzBuzz")
  );

    public static Map<Integer, String> stage2 = Map.ofEntries(
            entry(7, "Rizz"),
            entry(9, "FizzJazz"),
            entry(14, "Rizz"),
            entry(18, "FizzJazz"),
            entry(21, "FizzRizz"),
            entry(27, "FizzJazz"),
            entry(28, "Rizz")
    );

    public static Map<Integer, String> data = Map.ofEntries(
            entry(1, "1"),
            entry(2, "2"),
            entry(3, "Fizz"),
            entry(4, "4"),
            entry(5, "Buzz"),
            entry(6, "Fizz"),
            entry(7, "Rizz"),
            entry(8, "8"),
            entry(9, "Fizz"),
            entry(10, "Buzz"),
            entry(11, "Jazz"),
            entry(13, "13"),
            entry(14, "Rizz"),
            entry(15, "FizzBuzz"),
            entry(16, "16"),
            entry(17, "17"),
            entry(18, "Fizz"),
            entry(19, "19"),
            entry(20, "Buzz"),
            entry(21, "FizzRizz"),
            entry(22, "Jazz"),
            entry(23, "23"),
            entry(24, "Fizz"),
            entry(25, "Buzz"),
            entry(26, "26"),
            entry(27, "Fizz"),
            entry(28, "Rizz"),
            entry(29, "29"),
            entry(30, "FizzBuzz"),
            entry(77, "RizzJazz")

    );

    public static NumberToWordCorrespondent[] correspondentsData = {
            new NumberToWordCorrespondent(3, "Fizz"),
            new NumberToWordCorrespondent(5, "Buzz"),
            new NumberToWordCorrespondent(7, "Rizz"),
            new NumberToWordCorrespondent(11, "Jazz")
    };

    @org.junit.Test
    public void stage1() {
        code._2_challenge._1_fizzbuzz.FizzBuzz FizzBuzz = new code._2_challenge._1_fizzbuzz.FizzBuzz();
        for (Map.Entry<Integer, String> entry : stage1.entrySet()) {
            Integer input = entry.getKey();
            String actual = FizzBuzz.fizzBuzz(entry.getKey());
            String expected = entry.getValue();
            Assert.assertEquals("for input: " + input, expected, actual);
        }
    }

    @org.junit.Test
    public void stage2() {
        code._2_challenge._1_fizzbuzz.FizzBuzz FizzBuzz = new code._2_challenge._1_fizzbuzz.FizzBuzz();
        for (Map.Entry<Integer, String> entry : stage2.entrySet()) {
            Integer input = entry.getKey();
            String actual = FizzBuzz.fizzBuzz2(entry.getKey());
            String expected = entry.getValue();
            Assert.assertEquals("for input: " + input, expected, actual);
        }
    }

    @org.junit.Test
    public void myTest() {
        Challenge1 challenge1 = new Challenge1();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            Integer input = entry.getKey();
            String actual = Challenge1.getCorrespondentWordForNumber(entry.getKey(), correspondentsData);
            String expected = entry.getValue();
            Assert.assertEquals("for input: " + input, expected, actual);
        }
    }

}