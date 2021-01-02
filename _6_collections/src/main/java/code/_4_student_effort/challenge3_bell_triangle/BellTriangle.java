package code._4_student_effort.challenge3_bell_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellTriangle {
    private int triangleLength;

    public BellTriangle(int triangleLength) {
        this.triangleLength = triangleLength;
    }

    public List<List<Integer>> generateBellTriangle() {

        List<List<Integer>> bellTriangle = new ArrayList<>();
        bellTriangle.add(new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i <= triangleLength; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = bellTriangle.get(i - 1);

            row.add(previousRow.get(previousRow.size() - 1));

            for (int j = 0; j < previousRow.size(); j++)
                row.add(previousRow.get(j) + row.get(j));

            bellTriangle.add(row);
        }

        return bellTriangle;
    }
}
