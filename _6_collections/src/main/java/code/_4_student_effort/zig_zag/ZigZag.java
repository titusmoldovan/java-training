package code._4_student_effort.zig_zag;

import java.util.List;

public class ZigZag {
    public List<Integer> rearrange(List<Integer> list) {
        int temp;
        boolean sign = true; //true - <, false - >
        for (int i = 0; i < list.size() - 1; i++) {
            if (sign) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
                sign = false;
            } else {
                if (list.get(i) < list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
                sign = true;
            }
        }
        return list;
    }
}
