package code._4_student_effort._4_pair_of_3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(-1, -1, -1, 2);
        System.out.println("Count is : " + countPairs(arrayList));
    }

    public static Integer countPairs(List<Integer> numbers) {
        int cnt = 0;
        for (int i = 0; i < numbers.size() - 2; i++) {
            for (int j = i + 1; j < numbers.size() - 1; j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    int sum;
                    if (checkIfIsMaxInt(numbers.get(i)) || checkIfIsMaxInt(numbers.get(j))
                            || checkIfIsMaxInt(numbers.get(k))) {
                        sum = -1;
                    } else {
                        sum = numbers.get(i) + numbers.get(j) + numbers.get(k);
                    }
                    if (sum == 0) {
                        System.out.println(i + ":" + numbers.get(i) + "\n" + j + ":" + numbers.get(j) + "\n" + k + ":" + numbers.get(k));
                        numbers.set(i, Integer.MIN_VALUE);
                        numbers.set(j, Integer.MIN_VALUE);
                        numbers.set(k, Integer.MIN_VALUE);
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static boolean checkIfIsMaxInt(Integer number) {
        return number.equals(Integer.MIN_VALUE);
    }
}


