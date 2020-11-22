package code._4_student_effort.challenge_3;

import java.util.List;

public class Challenge3 {

    public static int countPairOfTwo(List<Integer> numbers) {

        int pairs = 0;

        while (numbers.size() > 1) {
            int check = numbers.size();
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(0) + numbers.get(j) == 0) {
                    pairs++;
                    numbers.remove(0);
                    numbers.remove(j - 1);
                    break;
                }
            }

            if (check == numbers.size())
                numbers.remove(0);
        }
        return pairs;
    }
}