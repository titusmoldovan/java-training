package code._4_student_effort.challenge3_rock_paper_scissors;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player extends Thread {

    private String option;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public void run() {
        List<String> options= Arrays.asList("paper", "scissors", "rock");
        Random rand = new Random();
        this.option = options.get(rand.nextInt(options.size()));
    }
}
