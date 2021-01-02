package code._4_student_effort.challenge3_bell_triangle;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BellTriangle bellTriangle = new BellTriangle(5);

        Iterator iterator = bellTriangle.generateBellTriangle().iterator();

        while (iterator.hasNext()) {
            List<Integer> currentRow = (List<Integer>) iterator.next();
            for (int i = 0; i < currentRow.size(); i++)
                System.out.print(currentRow.get(i) + " ");

            System.out.println();
        }
    }
}
