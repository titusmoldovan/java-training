package code._4_student_effort.pascal_triangle;

import code._4_student_effort.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle extends Triangle {

    public PascalTriangle(int height) {
        super(height);
    }

    @Override
    protected void generate() {
        triangle.add(Arrays.asList(1));
        List<Integer> sublist;
        for (int level = 1; level < height; level++) {
            sublist = new ArrayList<>();
            sublist.add(1);
            for (int position = 1; position < level; position++) {
                sublist.add(triangle.get(level - 1).get(position - 1) + triangle.get(level - 1).get(position));
            }
            sublist.add(1);
            triangle.add(sublist);
        }
    }
}
