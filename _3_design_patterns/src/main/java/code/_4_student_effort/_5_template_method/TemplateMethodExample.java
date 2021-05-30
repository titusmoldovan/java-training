package code._4_student_effort._5_template_method;

import code._4_student_effort._1_iterator.ArrayCustomIterator;

import java.util.Arrays;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr= Arrays.copyOf(arr,arr.length);

        AscBubbleSort asc=new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc=new DescBubbleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }
    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
