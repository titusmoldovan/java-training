package code._4_student_effort._5_template_method;

import java.util.List;

public abstract class AbstractSort {

    public void sort(List<Integer> list) {
        int ok;
        for (int i = 0; i < list.size() - 1; i++) {
            ok = 1;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (numbersInCorrectOrder(list.get(j), list.get(j + 1))) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                    ok = 0;
                }
            }
            if (ok == 1)
                break;
        }
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

