package code._4_student_effort.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExOne {

    private StringBuilder sb = new StringBuilder();
    private List<String> words = new ArrayList<>(Arrays.asList("Europe","dog","vacance","Java"));

    public ExOne() {
        this.words
                .forEach(s->sb.append(s.charAt(0)));
    }

    @Override
    public String toString() {
        return "ExOne{" +
                "sb=" + sb.toString() +
                '}';
    }
}
