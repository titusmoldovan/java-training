package code._4_student_effort.challenge2_strategy;

import java.util.Arrays;

public class StrategyExample {

    private static void displaySorted(SortingStrategy sortingStrategy, Integer[] arr) {
        sortingStrategy.sort(arr);

        for (Integer i : arr)
            System.out.println(i);

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }
}
