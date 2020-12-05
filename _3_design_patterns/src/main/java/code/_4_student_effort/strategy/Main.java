package code._4_student_effort.strategy;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] array){
        strategy.sort(array);
        for (int element: array)
            System.out.println(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] arrayCopy1 = Arrays.copyOf(array, array.length);
        Integer[] arrayCopy2 = Arrays.copyOf(array, array.length);

        displaySorted(new BubbleSort(), arrayCopy1);
        displaySorted(new MergeSort(), arrayCopy2);
    }
}
