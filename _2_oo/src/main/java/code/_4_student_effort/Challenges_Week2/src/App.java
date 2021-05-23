public class App {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("gica", 40, 35);
        Fighter fighter2 = new Fighter("dorel", 60, 20);

        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2);
        String winner = boxingMatch.fight();
        System.out.println("the winner is: "+ winner);
    }
}
