package code._4_student_effort.RockPapperScissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends Thread{
    private String playerName;
    private String chose;

    public Player(String name) {
        this.playerName = name;
    }
    @Override
    public void run() {
        List<String> options = new ArrayList<>(List.of("Rock","Papper","Scissors"));
        chose = options.get(new Random().nextInt(3));
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getChose() {
        return chose;
    }
}
