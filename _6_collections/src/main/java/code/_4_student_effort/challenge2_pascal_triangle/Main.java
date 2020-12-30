package code._4_student_effort.challenge2_pascal_triangle;

public class Main {

    public static void main(String[] args) {

        PascalTriangle pascalTriangle = new PascalTriangle(8);

        for (int i = 0; i < pascalTriangle.generatePascaltriangle().size(); i++)
            System.out.println(pascalTriangle.generatePascaltriangle().get(i));
    }
}
