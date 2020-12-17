package code._4_student_effort.Challange5_Binary;

import code._2_challenge._5_generic_binary_search.ArrayNotSortedException;

public class MainBinary {
    public static void main(String args[]) throws ArrayNotSortedException {
        //Integer[] array = new Integer[]{1, 5, 9,12,653,33,45};   ///not sorted
        Integer[] array = new Integer[]{1, 5, 9,12,25,33,45};
        System.out.println(BinarySearch.sort(array,0,array.length - 1,9));

        Integer[] array2 = new Integer[]{47,43, 37, 26, 21, 17,12, 5};
        System.out.println(BinarySearch.sort(array2,0,array.length - 1,17));

    }
}
