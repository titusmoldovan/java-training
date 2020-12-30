package code._4_student_effort.challenge1_leaders;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Leader leader= new Leader(new ArrayList<>(Arrays.asList(10,45,43,32,36,38,27,21,33,39,17,16,17,9,15,8,4,5,3,4) ));

        System.out.println(leader.getAllLeaders());
    }
}
