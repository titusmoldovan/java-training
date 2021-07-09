import java.util.Random;

public class Player extends Thread {
    private final String playerName;
    private int choiceIndex; // 0 - ROCK, 1 - PAPER, 2 - SCISSORS

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getChoiceIndex() {
        return choiceIndex;
    }

    @Override
    public void run() {
        System.out.println(playerName + "'s choice is " + this.chooseMove());
    }

    private String chooseMove() {
        String[] possibleChoices = {"Rock", "Paper", "Scissors"};
        Random choice = new Random();
        this.choiceIndex = choice.nextInt(3);
        return possibleChoices[choiceIndex];
    }
}