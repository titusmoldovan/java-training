package com.company.fighters;

public class ItalianFigher extends Fighter {
    public ItalianFigher(String name) {
        super(name, 100, 6D);
    }

    @Override
    public void attack(Fighter fighter) {
        Double damegeOfAttackFighter = this.getDamegePerAttack();
        this.setHealth((int) (this.getHealth() - damegeOfAttackFighter));
    }
}
