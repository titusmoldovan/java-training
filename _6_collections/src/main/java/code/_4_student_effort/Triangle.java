package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public abstract class Triangle {
    protected final List<List<Integer>> triangle;
    protected final int height;

    public Triangle(int height) {
        this.height = height;
        this.triangle = new ArrayList<>();
        generate();
    }

    protected abstract void generate();

    @Override
    public String toString() {
        StringBuilder triangleString = new StringBuilder();
        for (int level = 0; level < this.height; level++) {
            triangleString.append(" ".repeat(height - level - 1));
            for (int element : this.triangle.get(level)) {
                triangleString.append(element).append(" ");
            }
            triangleString.append("\n");
        }
        return triangleString.toString();
    }
}
