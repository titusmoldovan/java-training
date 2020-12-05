package code._4_student_effort.template;

import java.util.Arrays;

public class Main {
    public static void displaySorted(Integer[] array) {
        for (Integer element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] arrayCopy1 = Arrays.copyOf(array, array.length);
        Integer[] arrayCopy2 = Arrays.copyOf(array, array.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(arrayCopy1);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(arrayCopy2);

        displaySorted(arrayCopy1);
        displaySorted(arrayCopy2);
    }
}
