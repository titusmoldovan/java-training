package code._4_student_effort._2_strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{
                1, 4, 5, 2, 3, 6, 9, 8, 7
        };

        displaySorted(new BubbleSort(), Arrays.copyOf(arr, arr.length));
        displaySorted(new MergeSort(), Arrays.copyOf(arr, arr.length));
    }


    public static void displaySorted(SortingStrategy sortingStrategy, Integer[] arr) {
        sortingStrategy.sort(arr);
        for (Integer number : arr) {
            System.out.println(number);
        }
    }
}
