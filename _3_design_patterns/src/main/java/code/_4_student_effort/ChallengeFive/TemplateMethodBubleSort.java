package code._4_student_effort.ChallengeFive;

public abstract class TemplateMethodBubleSort {

    void sort(Integer[] list) {
        int length = list.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (!numbersInCorrectOrder(list[j], list[j + 1])) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

