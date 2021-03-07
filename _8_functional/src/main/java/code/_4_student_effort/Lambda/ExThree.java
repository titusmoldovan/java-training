package code._4_student_effort.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExThree {
    private List<String> list = new ArrayList<>(Arrays.asList("flower","tv","table","java"));

    public ExThree() {
        list.replaceAll(String::toUpperCase);
    }

    public List<String> getList() {
        return list;
    }
}
