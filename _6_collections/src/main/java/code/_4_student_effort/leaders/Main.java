package code._4_student_effort.leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 9, 4, 7, 2, 6, 4));
        Leader leader = new Leader();
        System.out.println(leader.findLeaders(array));
    }
}
