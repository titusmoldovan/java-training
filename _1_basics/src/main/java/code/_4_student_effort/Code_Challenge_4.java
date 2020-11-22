package code._4_student_effort;

import java.util.Arrays;
import java.util.Scanner;

public class Code_Challenge_4 {
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

        for (int i = 0; i < array_int.length - 2; i++) {
            for (int j = i + 1; j < array_int.length - 1; j++) {
                for (int h = j + 1; h < array_int.length; h++) {
                    boolean is_index_used = false;
                    for (int k = 0; k < nr_used_indexes_other; k++) {
                        if (used_indexes[k] == i || used_indexes[k] == j || used_indexes[k] == h) {
                            is_index_used = true;
                        }
                    }
                    if (!is_index_used && (array_int[i] + array_int[j] + array_int[h]) == 0) {
                        pairs++;
                        used_indexes[nr_used_indexes_other++] = i;
                        used_indexes[nr_used_indexes_other++] = j;
                        used_indexes[nr_used_indexes_other++] = h;
                        break;
                    }
                }
            }
        }
        System.out.print(Arrays.toString(array_int) + " => " + pairs);
        System.out.print((pairs == 1) ? " pair" : " pairs");
    }
}
