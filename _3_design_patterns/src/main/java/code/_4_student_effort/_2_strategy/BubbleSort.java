package code._4_student_effort._2_strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        int ok;
        for (int i = 0; i < list.length - 1; i++) {
            ok = 0;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                    ok = 1;
                }
            }
            if (ok == 0) {
                break;
            }
        }
    }
}
