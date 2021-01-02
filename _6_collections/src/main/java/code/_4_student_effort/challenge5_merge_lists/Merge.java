package code._4_student_effort.challenge5_merge_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge {

    private List<Integer> firstList;
    private List<Integer> secondList;

    public Merge(List<Integer> firstList, List<Integer> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public List<Integer> mergeLists() {

        secondList.forEach(element -> firstList.add(element));
        Collections.sort(firstList);

        return firstList;
    }
}
