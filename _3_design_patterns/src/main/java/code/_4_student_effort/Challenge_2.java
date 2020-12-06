package code._4_student_effort;

//Strategy pattern

import java.util.Arrays;

interface SortingStrategy {
    void sort(Integer[] list);
}

class BubbleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++)
            for (int j = 0; j < list.length - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
    }
}

class MergeSort implements SortingStrategy {

    //TODO
    @Override
    public void sort(Integer[] list) {

    }
}

public class Challenge_2 {
    static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            strategy.sort(arr);
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};

        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
//        displaySorted(new MergeSort(), copy02OfArr);
    }
}
