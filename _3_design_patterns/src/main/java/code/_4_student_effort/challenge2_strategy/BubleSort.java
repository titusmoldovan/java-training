package code._4_student_effort.challenge2_strategy;

public class BubleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {

        int length = list.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
    }
}
