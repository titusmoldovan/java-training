package code._4_student_effort.ChallengeOne;

public class BoxingMatch {
    private final Fighter firstFighter, secondFighter;

    public BoxingMatch(Fighter firstFighter, Fighter secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    public String fight() {
        System.out.println("********Warm UP********");
        System.out.println(firstFighter);
        System.out.println(secondFighter);
        System.out.println("***********************");
        int round = 0;
        while (firstFighter.getHealth() > 0.0 && secondFighter.getHealth() > 0.0 && round <=12) {

            for (round = 1; round <= 12; round++) {
                if (firstFighter.getHealth() <= 0.0 || secondFighter.getHealth() <= 0.0) {
                    if (Double.compare(firstFighter.getHealth(), secondFighter.getHealth()) != 0) {
                        System.out.println("Knock OUT!");
                    }
                    break;
                }
                System.out.println("Round: " + round);
                switch (round) {
                    case 1, 2, 3:
                        showCurrentFight();
                        break;
                    case 4, 5, 6:
                        decreaseDamageAttack(firstFighter, round, 0.1);
                        decreaseDamageAttack(secondFighter, round, 0.1);
                        showCurrentFight();

                        break;
                    case 7, 8, 9:
                        decreaseDamageAttack(firstFighter, round, 0.1);
                        decreaseDamageAttack(secondFighter, round, 0.1);
                        showCurrentFight();
                        break;
                    case 10, 11, 12:
                        decreaseDamageAttack(firstFighter, round, 0.1);
                        decreaseDamageAttack(secondFighter, round, 0.1);
                        showCurrentFight();
                        break;
                }
            }
        }

        return Double.compare(firstFighter.getHealth(), secondFighter.getHealth()) == 0 ? "Tie!" :
                Double.compare(firstFighter.getHealth(), secondFighter.getHealth()) > 0 ? firstFighter.getName() :
                        secondFighter.getName();

    }

    private void showCurrentFight() {
        firstFighter.attack(secondFighter);
        System.out.println(secondFighter);
        secondFighter.attack(firstFighter);
        System.out.println(firstFighter);
    }

    private void decreaseDamageAttack(Fighter fighter, int round, double factor) {
        if ((fighter.getHealth()) > 0.0 && (fighter.getDamagePerAttack() - (round * factor)) > 0.0) {
            fighter.setDamagePerAttack(fighter.getDamagePerAttack() - round * factor);
        }
    }

}
