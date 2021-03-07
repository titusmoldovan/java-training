package code._4_student_effort.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ExFive implements Runnable {
    private List<Integer> numbers = new ArrayList<>();

    public ExFive() {
        populateList();
    }

    private void populateList(){
        for(int i = 0; i <= 100 ; i ++){
            numbers.add(i);
        }
    }

    @Override
    public void run() {
        numbers.stream().forEach(System.out::println);
    }
}
