package code._4_student_effort.Challange5;

import java.util.Arrays;

public class Main {
    public static void main(String args[])
    {
        Integer arr[] = new Integer[]{3,5,26,4,3,63,5,23,6,4,32,54,32,453,3,23};
        Integer[] copy1 = Arrays.copyOf(arr,arr.length);
        Integer[] copy2 = Arrays.copyOf(arr,arr.length);


        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy1);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy2);

        displayArray(copy1);
        displayArray(copy2);

    }

    public static void displayArray(Integer[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
