package com.company;

public class Fighter {
    String name;
    Integer health;
    Integer damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
