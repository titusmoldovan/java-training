package code._4_student_effort.DesignPatternsChallenge2;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {

        if (list.length < 2) {
            return;
        }

        int middle = list.length / 2;
        Integer[] leftPart;
        leftPart = Arrays.copyOfRange(list, 0, middle);
        Integer[] rightPart;
        rightPart = Arrays.copyOfRange(list, middle, list.length);
        sort(leftPart);
        sort(rightPart);
        merge(list, leftPart, rightPart);
    }

    private void merge(Integer[] list, Integer[] leftPart, Integer[] rightPart) {

        int listIndex = 0, leftPartIndex = 0, rightPartIndex = 0;

        while (leftPartIndex < leftPart.length && rightPartIndex < rightPart.length) {
            if (leftPart[leftPartIndex] <= rightPart[rightPartIndex]) {
                list[listIndex++] = leftPart[leftPartIndex++];
            } else list[listIndex++] = rightPart[rightPartIndex++];
        }

        while (leftPartIndex < leftPart.length) {
            list[listIndex++] = leftPart[leftPartIndex++];
        }

        while (rightPartIndex < rightPart.length) {
            list[listIndex++] = rightPart[rightPartIndex++];
        }
    }
}
