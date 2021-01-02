package code._4_student_effort.bell_triangle;

import code._4_student_effort.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellTriangle extends Triangle {
    public BellTriangle(int height) {
        super(height);
    }

    @Override
    protected void generate() {
        triangle.add(Arrays.asList(1));
        List<Integer> sublist;
        for (int level = 1; level < height; level++) {
            sublist = new ArrayList<>();
            sublist.add(triangle.get(level - 1).get(level - 1));
            for (int position = 1; position <= level; position++) {
                sublist.add(triangle.get(level - 1).get(position - 1) + sublist.get(position - 1));
            }
            triangle.add(sublist);
        }
    }
}
