package code._4_student_effort.challenge_1;

import code._2_challenge._1_two_fighters.Fighter;

public class BoxingMatch {

    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public String fight() {
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.health <= 0) {
            return fighter2.name;
        } else {
            return fighter1.name;
        }
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("F1", 100, 10);
        Fighter f2 = new Fighter("F2", 100, 10);
        BoxingMatch boxingMatch = new BoxingMatch(f1, f2);
        System.out.println("The winner is "+boxingMatch.fight());
    }
}
