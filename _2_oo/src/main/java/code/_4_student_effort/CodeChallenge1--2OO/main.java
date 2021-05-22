public class main {
    public static void main(String args[]) {
        System.out.println("This is a boxing ring. " + "This are the fighters:");
        Fighter dirtyMoney = new Fighter("Dirty Money", 100, 15);
        Fighter goodMorality = new Fighter("Good Morality", 100, 15);
        dirtyMoney.displayStats();
        goodMorality.displayStats();
        BoxingMatch match = new BoxingMatch();
        System.out.println("A match between " + dirtyMoney.getName() + " and " + goodMorality.getName() + " beggins. The match will play until one of the fighters" +
                " gets knocked put.Every round one of the fighters will atack" +
                " the other one. This is decided by a random number.");
        match.fight(dirtyMoney, goodMorality);
    }
}
