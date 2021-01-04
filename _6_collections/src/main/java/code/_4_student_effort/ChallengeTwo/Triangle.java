package code._4_student_effort.ChallengeTwo;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private int dimension;
    private List<List<Integer>> triangle = new ArrayList<>();

    public Triangle(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Integer>> getTriangle() {
        return triangle;
    }

    public void setTriangle() {
        for (int i = 0; i < dimension; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if ((j == 0) || (j == i)) {
                    row.add(1);
                } else {
                    row.add((triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1)));
                }
            }
            triangle.add(row);
        }
    }

    public void drawTriangle() {
        setTriangle();
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }
}

