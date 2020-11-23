package code._4_student_effort.ChallengeFour;

import java.util.HashMap;
import java.util.Map;

public class PairOf3 {
    public static final int countPairs(Integer[] arr, int sum) {
        int noPairs = 0;
        Map<Integer, Boolean> isInPair = new HashMap<Integer, Boolean>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (!isInPair.containsKey(i) && !isInPair.containsKey(j) && !isInPair.containsKey(k)) {
                        if (arr[i] + arr[j] + arr[k] == sum) {
                            noPairs += 1;
                            isInPair.put(i, true);
                            isInPair.put(j, true);
                            isInPair.put(k, true);
                        }
                    }
                }
            }
        }
        return noPairs;
    }
}
