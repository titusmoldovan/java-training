public class BoxingMatch {
    RandomNumber rand = new RandomNumber();

    void fight(Fighter fighter1, Fighter fighter2) {
        int round = 1;
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            System.out.println("ROUND NUMBER " + round);
            round++;
            int randomNumber = rand.getRandomNumber();
            if (randomNumber >= 5)
                fighter1.attack(fighter2);
            else fighter2.attack(fighter1);
        }
        if (fighter1.getHealth() < 1)
            System.out.println(fighter1.getName() + " gets knocked out.\n" + fighter2.getName() + " IS THE WINNER!!");
        if (fighter2.getHealth() < 1)
            System.out.println(fighter2.getName() + " gets knocked out.\n" + fighter1.getName() + " IS THE WINNER!!");
    }
}
