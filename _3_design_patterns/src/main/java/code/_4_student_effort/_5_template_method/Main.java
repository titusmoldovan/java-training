package code._4_student_effort._5_template_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractSort ascSort = new AscBubbleSort();
        AbstractSort descSort = new DescBubbleSort();
        List<Integer> list1 = Arrays.asList(8, 5, 1, 2);
        List<Integer> list2 = new ArrayList<>(list1);
        ascSort.sort(list1);
        descSort.sort(list2);
        list1.forEach(System.out::print);
        System.out.println();
        list2.forEach(System.out::print);
    }
}
