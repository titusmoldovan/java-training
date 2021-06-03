package code._4_student_effort._4_student_effort._3_pair_of_2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(3, 2, -3, -2, 3, 0);

        System.out.println("Count is : " + makePairs(arrayList));
    }

    public static Integer makePairs(List<Integer> numbers) {
        int cnt = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int sum;
                if (checkIfIsMaxInt(numbers.get(i)) || checkIfIsMaxInt(numbers.get(j))) {
                    sum = -1;
                } else {
                    sum = numbers.get(i) + numbers.get(j);
                }
                if (sum == 0) {
                    System.out.println(i + ":" + numbers.get(i) + "\n" + j + ":" + numbers.get(j));
                    numbers.set(i, Integer.MIN_VALUE);
                    numbers.set(j, Integer.MIN_VALUE);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static boolean checkIfIsMaxInt(Integer number) {
        return number.equals(Integer.MIN_VALUE);
    }
}

