package code._4_student_effort.DesignPatternsChallenge2;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] array) {
        strategy.sort(array);
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println('\n');
    }

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] arrayCopy1 = Arrays.copyOf(array, array.length);
        Integer[] arrayCopy2 = Arrays.copyOf(array, array.length);

        System.out.println("Result after BubbleSort: ");
        displaySorted(new BubbleSort(), arrayCopy1);
        System.out.println("Result after MergeSort: ");
        displaySorted(new MergeSort(), arrayCopy2);
    }
}

