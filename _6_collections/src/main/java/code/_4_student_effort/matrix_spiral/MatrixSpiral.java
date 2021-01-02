package code._4_student_effort.matrix_spiral;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class MatrixSpiral {
    private final List<List<Integer>> matrix;
    private final int dimension;

    public MatrixSpiral(int dimension) {
        this.dimension = dimension;
        this.matrix = new ArrayList<>();
        generate();
    }

    private void initialize() {
        for (int i = 0; i < dimension; i++)
            this.matrix.add(Arrays.asList(new Integer[dimension]));
    }

    private void generate() {
        initialize();
        int value = 1, position;
        for (int square = 0; square <= dimension / 2; square++) {
            for (position = square; position < dimension - square; position++)
                matrix.get(square).set(position, value++);
            for (position = square + 1; position < dimension - square; position++)
                matrix.get(position).set(dimension - square - 1, value++);
            for (position = dimension - square - 2; position >= square; position--)
                matrix.get(dimension - square - 1).set(position, value++);
            for (position = dimension - square - 2; position > square; position--)
                matrix.get(position).set(square, value++);
        }
    }

    public void displayElements() {
        int position;
        for (int square = 0; square <= dimension / 2; square++) {
            for (position = square; position < dimension - square; position++)
                System.out.print(matrix.get(square).get(position) + " ");
            for (position = square + 1; position < dimension - square; position++)
                System.out.print(matrix.get(position).get(dimension - square - 1) + " ");
            for (position = dimension - square - 2; position >= square; position--)
                System.out.print(matrix.get(dimension - square - 1).get(position) + " ");
            for (position = dimension - square - 2; position > square; position--)
                System.out.print(matrix.get(position).get(square) + " ");
        }
    }

    @Override
    public String toString() {
        StringBuilder matrixString = new StringBuilder();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++)
                matrixString.append(matrix.get(i).get(j)).append(" ");
            matrixString.append("\n");
        }
        return matrixString.toString();
    }
}
