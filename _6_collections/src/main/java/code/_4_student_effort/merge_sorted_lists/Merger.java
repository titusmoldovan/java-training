package code._4_student_effort.merge_sorted_lists;

import java.util.ArrayList;
import java.util.List;

public class Merger {
    public List<Integer> merge(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> mergedList = new ArrayList<>();
        int positionFirstList = 0, positionSecondList = 0;
        while (positionFirstList < firstList.size() && positionSecondList < secondList.size()) {
            if (firstList.get(positionFirstList) <= secondList.get(positionSecondList)) {
                mergedList.add(firstList.get(positionFirstList));
                positionFirstList++;
            } else {
                mergedList.add(secondList.get(positionSecondList));
                positionSecondList++;
            }
        }
        while (positionFirstList < firstList.size()) {
            mergedList.add(firstList.get(positionFirstList));
            positionFirstList++;
        }
        while (positionSecondList < secondList.size()) {
            mergedList.add(secondList.get(positionSecondList));
            positionSecondList++;
        }
        return mergedList;
    }
}
