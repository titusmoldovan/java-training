package code._4_student_effort.ChallengeThree;

import java.util.ArrayList;
import java.util.List;

public class BellTriangle {
    private int dimension;
    private List<List<Integer>> triangle = new ArrayList<>();

    public BellTriangle(int dimension) {
        this.dimension = dimension;
    }

    public void constructTriangle() {
        for (int i = 0; i < dimension; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (i == 0) {
                    row.add(1);
                } else {
                    if (j == 0) {
                        row.add(triangle.get(i - 1).get(triangle.get(i - 1).size() - 1));
                    } else {
                        row.add(row.get(j - 1) + triangle.get(i - 1).get(j - 1));
                    }
                }
            }
            triangle.add(row);
        }

    }

    public void printTriangle() {
        constructTriangle();
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println(" ");
        }
    }
}
