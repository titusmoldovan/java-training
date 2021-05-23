package com.company.fighters;

public class HungarianFighter extends Fighter {

    public HungarianFighter(String name) {
        super(name, 100, 6D);
    }

    @Override
    public void attack(Fighter fighter) {
        Double damegeOfAttackFighter = this.getDamegePerAttack() * this.getHealth() / 100;
        this.setHealth((int) (fighter.getHealth() - damegeOfAttackFighter));
    }
}
