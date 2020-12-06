package code._4_student_effort.Challange2;

import java.util.Arrays;

public class Main {

    public static void displaySorted(SortingStrategy strategy, Integer[] arr)
    {
        strategy.sort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String args[])
    {
        Integer arr[] = new Integer[]{1,53,64,32,6,32,64,23,32,3,5,6,2,467,32};
        Integer copy1[] = Arrays.copyOf(arr,arr.length);
        Integer copy2[] = Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(),copy1);
        displaySorted(new MergeSort(),copy2);

    }
}
