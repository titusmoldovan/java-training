package code._4_student_effort.DesignPatternsChallenge5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] coppy010Arr = Arrays.copyOf(array, array.length);
        Integer[] coppy020Arr = Arrays.copyOf(array, array.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(coppy010Arr);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(coppy020Arr);

        System.out.print("Result after AscBubleSort: ");
        displaySorted(coppy010Arr);
        System.out.print("Result after DescBubleSort: ");
        displaySorted(coppy020Arr);
    }

    public static void displaySorted(Integer[] arr) {
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
