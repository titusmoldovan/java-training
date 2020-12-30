package code._4_student_effort.challenge2_pascal_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    private int triangleSize;

    public PascalTriangle(int triangleSize) {
        this.triangleSize = triangleSize;
    }

    public int getTriangleSize() {
        return triangleSize;
    }

    public void setTriangleSize(int triangleSize) {
        this.triangleSize = triangleSize;
    }

    public List<List<Integer>> generatePascaltriangle() {

        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(new ArrayList<>(Arrays.asList(1)));
        pascalTriangle.add(new ArrayList<>(Arrays.asList(1, 1)));

        for (int i = 2; i < triangleSize; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 0; j < pascalTriangle.get(i - 1).size() - 1; j++) {
                Integer r = pascalTriangle.get(i - 1).get(j) + pascalTriangle.get(i - 1).get(j + 1);
                row.add(pascalTriangle.get(i - 1).get(j) + pascalTriangle.get(i - 1).get(j + 1));
            }

            row.add(1);
            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }
}
