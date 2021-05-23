package com.company.fighters;

public class RomanianFighter extends Fighter {
    public RomanianFighter(String name) {
        super(name, 100, 8D);
    }

    @Override
    public void attack(Fighter fighter) {
        Double damegeOfAttackFighter = this.getDamegePerAttack();
        this.setHealth((int) (fighter.getHealth() - damegeOfAttackFighter));
    }
}
