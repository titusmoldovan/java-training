package code._4_student_effort.RockPapperScissors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.start();
        player1.join();
        player2.start();

        System.out.println(player1.getPlayerName()+": "+player1.getChose());
        System.out.println(player2.getPlayerName()+": "+player2.getChose());

        match(player1,player2);

    }

    private static void match(Player player1, Player player2) {
        if(player1.getChose().equals(player2.getChose())){
            System.out.println("Draw");
        }else if(player1.getChose().equals("Papper")){
            if(player2.getChose().equals("Rock")){
                System.out.println("Winner: "+ player1.getPlayerName());
            }else{
                System.out.println("Winner:"+ player2.getPlayerName());
            }
        }else if(player1.getChose().equals("Rock")){
            if(player2.getChose().equals("Papper")){
                System.out.println("Winner: "+ player2.getPlayerName());
            }else{
                System.out.println("Winner: "+ player1.getPlayerName());
            }
        }else{
            if(player2.getChose().equals("Rock")){
                System.out.println("Winner: "+ player2.getPlayerName());
            }else{
                System.out.println("Winner: "+ player1.getPlayerName());
            }
        }
    }
}
