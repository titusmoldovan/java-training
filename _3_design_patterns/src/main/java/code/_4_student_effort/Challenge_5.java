package code._4_student_effort;

//Template method pattern

import java.util.Arrays;

abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++)
            for (int j = 0; j < list.length - i - 1; j++)
                if (numbersInCorrectOrder(list[j], list[j + 1])) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
//        numbersInCorrectOrder(Integer i1, Integer i2);
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

class AscBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if (i1 > i2) {
            return true;
        }
        return false;
    }
}

class DescBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if (i2 > i1) {
            return true;
        }
        return false;
    }
}

public class Challenge_5 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};

        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        //1 2 3 4 5 6 7 8 9

        displaySorted(copy02OfArr);
        //9 8 7 6 5 4 3 2 1
    }

    public static void displaySorted(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
