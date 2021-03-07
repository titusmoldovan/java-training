package code._4_student_effort.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExTwo {
    private List<String> list = new ArrayList<>(Arrays.asList("Dog","country","chair","Java"));

    public ExTwo() {
      this.list.removeIf(s -> s.length()%2 == 1 );
    }

    public List<String> getList() {
        return list;
    }
}
