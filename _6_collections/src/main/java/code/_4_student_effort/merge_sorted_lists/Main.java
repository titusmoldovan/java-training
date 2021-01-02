package code._4_student_effort.merge_sorted_lists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Merger merger = new Merger();
        System.out.println(merger.merge(Arrays.asList(1, 5, 6), Arrays.asList(2, 3, 4)));
        System.out.println(merger.merge(Arrays.asList(1, 5, 6, 7, 8, 9), Arrays.asList(2, 3, 4)));
    }
}
