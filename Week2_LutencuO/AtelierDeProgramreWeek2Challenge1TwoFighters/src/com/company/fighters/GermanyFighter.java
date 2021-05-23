package com.company.fighters;

public class GermanyFighter extends Fighter {

    public GermanyFighter(String name) {
        super(name, 100, 10D);
    }

    @Override
    public void attack(Fighter fighter) {
        Double damegeOfAttackFighter = this.getDamegePerAttack() * this.getHealth() / 100;
        this.setHealth((int) (fighter.getHealth() - damegeOfAttackFighter));
    }
}
