package code._4_student_effort.zig_zag;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        System.out.println(zigZag.rearrange(Arrays.asList(4, 3, 7, 8, 6, 2, 1)));
        System.out.println(zigZag.rearrange(Arrays.asList(1, 4, 3, 2)));
    }
}
