package code._4_student_effort.challenge3_rock_paper_scissors;

public class RockPaperScissorsChallenge {

    public static void main(String[] args) throws InterruptedException {

        Player player1=new Player();
        Player player2=new Player();

        player1.start();
        player2.start();

        //wait for then to finish
        player1.join();
        player2.join();

        displayWinner(player1, player2);

    }

    private static void displayWinner(Player p1, Player p2) {
        String o1 = p1.getOption();
        String o2 = p2.getOption();

        if (o1.equals(o2)) {
            System.out.println(o1 + " vs " + o2 + " => EQUALITY");
        } else if (
                o1.equals("paper") && o2.equals("rock") ||
                        o1.equals("rock") && o2.equals("scissors") ||
                        o1.equals("scissors") && o2.equals("paper")
        ) {
            System.out.println(o1 + " vs " + o2 + " => P1 WINS");
        } else {
            System.out.println(o1 + " vs " + o2 + " => P2 WINS");
        }
    }
}
