package code._4_student_effort.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        boolean inOrder = false;
        while (!inOrder) {
            inOrder = true;
            for (int i = 0; i < list.length - 1; i++)
                if (list[i] > list[i + 1]) {
                    Integer copy = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = copy;
                    inOrder = false;
                }
        }
    }
}
