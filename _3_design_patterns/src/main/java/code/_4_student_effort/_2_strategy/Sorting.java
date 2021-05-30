package code._4_student_effort._2_strategy;

import java.util.Arrays;

public class Sorting {
    public void displaySorting(SortingStrategy strategy, int[] arr){
        strategy.sort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,5,2,3,6,9,8,7};
        int[] copy01OfArr= Arrays.copyOf(arr,arr.length);
        int[] copy02OfArr=Arrays.copyOf(arr,arr.length);
        Sorting sorting=new Sorting();
        sorting.displaySorting(new BubleSort(),copy01OfArr);
        sorting.displaySorting(new MergeSort(),copy02OfArr);
    }
}
