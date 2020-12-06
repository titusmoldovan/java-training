package code._4_student_effort.Strategy;

import java.util.Arrays;

interface SortingStrategy{
    void sort(Integer[] list);
}

class BubleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list){
        for(int i = 0; i<list.length-1; i++){
            for(int j = 0; j<list.length-1;j++){
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}

class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list){
        for(int i = 0; i<list.length-1; i++){
            for(int j = 0; j<list.length-1;j++){
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}

class Sortare{
    public void displaySorted2(SortingStrategy strategy, Integer[] list){
        strategy.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}

public class StrategyMain {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr,arr.length);

        Sortare bbl = new Sortare();
        Sortare mrg = new Sortare();

        bbl.displaySorted2(new BubleSort(), copy01OfArr);
        mrg.displaySorted2(new MergeSort(), copy02OfArr);
    }
}
