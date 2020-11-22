package code._4_student_effort;

import java.util.Scanner;

public class Code_Challenge_3 {
    public static void main(String[] args) {
        Scanner array_in = new Scanner(System.in);
        System.out.println("Array's elements: ");
        String[] data = array_in.nextLine().split(",");
        int[] array_int = new int[data.length];
        for (int i = 0; i < array_int.length; i++) {
            array_int[i] = Integer.parseInt(data[i]);
        }
        int pairs = 0, nr_used_indexes_other = 0;
        int[] used_indexes = new int[array_int.length];

        for (int i = 0; i < array_int.length - 1; i++) {
            for (int j = i + 1; j < array_int.length; j++) {
                for (int k = 0; k < nr_used_indexes_other; k++) {
                    if (used_indexes[k] == i || used_indexes[k] == j) {
                    break;
                    }
                }
                if ((array_int[i] + array_int[j]) == 0) {
                    pairs++;
                    used_indexes[nr_used_indexes_other++] = i;
                    used_indexes[nr_used_indexes_other++] = j;
                    break;
                }
            }
        }
        if (pairs == 1) {
            System.out.print("Is 1 pair.");
        } else System.out.print("Are " + pairs + " pairs.");
    }
}
