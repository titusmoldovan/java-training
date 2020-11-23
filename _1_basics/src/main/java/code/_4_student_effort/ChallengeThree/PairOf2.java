package code._4_student_effort.ChallengeThree;

import java.util.HashMap;
import java.util.Map;

public class PairOf2 {

    public static final Integer countPairs(Integer[] values) {
        int noPairs = 0;
        //make a map with format: value = no of occurences in integer array
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            if (!occurences.containsKey(values[i])) {
                occurences.put(values[i], 1);
            } else {
                occurences.put(values[i], occurences.get(values[i]) + 1);
            }
        }
        //iterate the map
        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            //if the map contains a entry which is complement of the current entry
            if (occurences.containsKey(0 - entry.getKey()) && entry.getKey() != 0) {
                //increment the no of pairs with the minimum value of values of the two entries
                noPairs += Math.min(entry.getValue(), occurences.get(0 - entry.getKey()));
                //set the value if complement of the current entry with 0 to not make additional increment
                //when the loop will fint the complement
                occurences.put(0 - entry.getKey(), 0);
            }
        }
        return noPairs;
    }

    public static void main(String[] args) {
        Integer[] sir = new Integer[]{1, 1, 0, -1, -1};
        countPairs(sir);
    }
}
