package code._4_student_effort.template;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        boolean inOrder = false;
        while (!inOrder) {
            inOrder = true;
            for (int i = 0; i < list.length - 1; i++)
                if (!numbersInCorrectOrder(list[i], list[i + 1])) {
                    Integer copy = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = copy;
                    inOrder = false;
                }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
