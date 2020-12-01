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
        while (firstFighter.getHealth() > 0.0 && secondFighter.getHealth() > 0.0 && round <= 12) {

            for (int i = 1; i <= 12; i++) {
                round = i;
                if (firstFighter.getHealth() <= 0.0 || secondFighter.getHealth() <= 0.0) {
                    if (firstFighter.getHealth() != secondFighter.getHealth()) {
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
                        firstFighter.decreaseDamageAttack(round, 0.1);
                        secondFighter.decreaseDamageAttack(round, 0.1);
                        showCurrentFight();

                        break;
                    case 7, 8, 9:
                        firstFighter.decreaseDamageAttack(round, 0.1);
                        secondFighter.decreaseDamageAttack(round, 0.1);
                        showCurrentFight();
                        break;
                    case 10, 11, 12:
                        firstFighter.decreaseDamageAttack(round, 0.1);
                        secondFighter.decreaseDamageAttack(round, 0.1);
                        showCurrentFight();
                        break;
                }
            }
        }

        return firstFighter.getHealth() == secondFighter.getHealth() ? "Tie" :
                firstFighter.getHealth() > secondFighter.getHealth() ? firstFighter.getName() : secondFighter.getName();

//        return Double.compare(firstFighter.getHealth(), secondFighter.getHealth()) == 0 ? "Tie!" :
//                Double.compare(firstFighter.getHealth(), secondFighter.getHealth()) > 0 ? firstFighter.getName() :
//                        secondFighter.getName();

    }

    private void showCurrentFight() {
        firstFighter.attack(secondFighter);
        System.out.println(secondFighter);
        secondFighter.attack(firstFighter);
        System.out.println(firstFighter);
    }

}
