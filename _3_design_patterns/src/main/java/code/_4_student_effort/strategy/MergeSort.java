package code._4_student_effort.strategy;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {

    private void merge(Integer[] list, Integer[] leftSublist, Integer[] rightSublist) {
        int listPosition = 0, leftSublistPosition = 0, rightSublistPosition = 0;
        while (leftSublistPosition < leftSublist.length && rightSublistPosition < rightSublist.length) {
            if (leftSublist[leftSublistPosition] <= rightSublist[rightSublistPosition])
                list[listPosition++] = leftSublist[leftSublistPosition++];
            else
                list[listPosition++] = rightSublist[rightSublistPosition++];
        }
        while (leftSublistPosition < leftSublist.length)
            list[listPosition++] = leftSublist[leftSublistPosition++];
        while (rightSublistPosition < rightSublist.length)
            list[listPosition++] = rightSublist[rightSublistPosition++];
    }

    @Override
    public void sort(Integer[] list) {
        if (list.length >= 2) {
            int middle = list.length / 2;
            Integer[] leftSublist = Arrays.copyOfRange(list, 0, middle);
            Integer[] rightSublist = Arrays.copyOfRange(list, middle, list.length);

            this.sort(leftSublist);
            this.sort(rightSublist);
            this.merge(list, leftSublist, rightSublist);
        }
    }
}
