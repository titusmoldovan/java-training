package code._4_student_effort.challenge_4;

import java.util.List;

public class Challenge4 {

    public static int countPairOfThree(List<Integer> numbers) {

        int pairs = 0;
        boolean stop = false;

        while (numbers.size() > 1)
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    for (int k = j + 1; k < numbers.size(); k++) {

                        if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 0) {
                            pairs++;
                            numbers.remove(i);
                            numbers.remove(j - 1);
                            numbers.remove(k - 2);
                            stop = true;
                            break;
                        }
                    }
                    if (stop)
                        break;
                }
            }

        return pairs;
    }
}
