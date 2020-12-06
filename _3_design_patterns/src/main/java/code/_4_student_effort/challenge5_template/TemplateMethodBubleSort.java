package code._4_student_effort.challenge5_template;

public abstract class TemplateMethodBubleSort {

    public void sort(Integer[] list) {
        int length = list.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (numbersInCorrectOrder(list[j], list[j + 1])) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
