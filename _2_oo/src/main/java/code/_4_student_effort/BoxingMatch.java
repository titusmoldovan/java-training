package com.company;

public class BoxingMatch {

    Fighter fighter1, fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    boolean didAnyoneWin(Fighter fighter1, Fighter fighter2) {
        if (fighter1.health <= 0)
            return true;

        if (fighter2.health <= 0)
            return true;

        return false;
    }

    public String fight() {

        while (didAnyoneWin(fighter1, fighter2) == false) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }

        if (fighter1.health <= 0)
            return fighter2.name;

        return fighter1.name;
    }

    public static void main(String[] args) {

        Fighter Andrei = new Fighter("Andrei", 100, 1);
        Fighter Ana = new Fighter("Ana", 20, 50);
        BoxingMatch match = new BoxingMatch(Andrei, Ana);

        System.out.println(match.fight());
    }

}
