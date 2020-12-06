package code._4_student_effort.Template;

import java.util.Arrays;

class AscBubbleSort extends TemplateMethodBubbleSort{
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 <= i2;
    }
}

class DescBubbleSort extends TemplateMethodBubbleSort{
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i2 <= i1;
    }
}

abstract class TemplateMethodBubbleSort{
    void sort(Integer[] list){
        for(int i = 0; i<list.length-1; i++){
            for(int j = 0; j<list.length-1;j++){
                if (!numbersInCorrectOrder(list[j], list[j + 1])) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
            }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

public class TemplateMethodExample {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);

        }
        private static void displaySorted(Integer[] arr){
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println();


    }

}
