public class RockPaperScissors {
    private final Player p1;
    private final Player p2;

    public RockPaperScissors(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String gameResult() {
        /*
        BEARING IN MIND THAT
        0 - ROCK
        1 - PAPER
        2 - SCISSORS
        THEN
        O - BEATS 2
        1 - BEATS 0
        2 - BEATS 1
         */
        if (p1.getChoiceIndex() != p2.getChoiceIndex()) {
            if (p1.getChoiceIndex() == p2.getChoiceIndex() + 1 || p1.getChoiceIndex() == p2.getChoiceIndex() - 2)
                return p1.getPlayerName() + " wins!";
            else if (p1.getChoiceIndex() == p2.getChoiceIndex() + 2 || p1.getChoiceIndex() == p2.getChoiceIndex() - 1)
                return p2.getPlayerName() + " wins!";
        }
        return "Tie!";
    }

    public static void main(String[] args) {

        Player p1 = new Player("Paula");
        Player p2 = new Player("Cosmin");
        p1.start();
        try {
            p1.join();
        } catch (Exception e) {
            System.out.println("Interrupted exception!");
        }
        p2.start();
        try {
            p2.join();
        } catch (Exception e) {
            System.out.println("Interrupted exception!");
        }

        RockPaperScissors match = new RockPaperScissors(p1, p2);
        System.out.println(match.gameResult());
    }
}
