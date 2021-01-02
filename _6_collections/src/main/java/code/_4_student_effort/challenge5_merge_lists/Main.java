package code._4_student_effort.challenge5_merge_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Merge merge=new Merge(new ArrayList<>(Arrays.asList(1,5,6,7,8,9)), new ArrayList<>(Arrays.asList(2,3,4,10,11)));
        System.out.println(merge.mergeLists());
    }
}
