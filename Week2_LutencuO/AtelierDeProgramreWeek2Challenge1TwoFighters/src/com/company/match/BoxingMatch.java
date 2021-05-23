package com.company.match;

import com.company.fighters.Fighter;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        //number= 0 or 1
        int randomNumber = (int) (Math.random() * (2));
        Fighter firstHit = null;
        Fighter secondHit = null;

        switch (randomNumber) {
            case 0:
                firstHit = fighter1;
                secondHit = fighter2;
                break;
            case 1:
                firstHit = fighter2;
                secondHit = fighter1;
                break;
            default:
                System.out.println("error mesage");
        }

        while (firstHit.getHealth() > 0 && secondHit.getHealth() > 0) {
            firstHit.attack(secondHit);
            secondHit.attack(firstHit);
        }

        if (firstHit.getHealth() > 0) return firstHit.getName();

        return secondHit.getName();
    }
}
