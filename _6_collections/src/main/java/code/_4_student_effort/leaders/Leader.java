package code._4_student_effort.leaders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leader {
    public List<Integer> findLeaders(List<Integer> array) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < array.size() - 1; i++) {
            if (Collections.max(array.subList(i + 1, array.size())) < array.get(i))
                leaders.add(array.get(i));
        }
        leaders.add(array.get(array.size() - 1));
        return leaders;
    }
}
