package code._4_student_effort;

import code._2_challenge._1_iterator.ArrayCustomIterator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Window.getInstance();
        int[] arr = new int[]{1, 2, 3};
        MyIteratorImpl it = new MyIteratorImpl(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
