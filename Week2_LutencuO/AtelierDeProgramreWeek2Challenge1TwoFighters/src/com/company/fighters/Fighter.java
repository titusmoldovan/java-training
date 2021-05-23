package com.company.fighters;

public abstract class Fighter {

    private String name;
    private Integer health;
    private Double damegePerAttack;

    public Fighter(String name, Integer health, Double damegePerAttack) {
        this.name = name;
        this.health = health;
        this.damegePerAttack = damegePerAttack;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public Double getDamegePerAttack() {
        return damegePerAttack;
    }

    public abstract void attack(Fighter fighter);
}
