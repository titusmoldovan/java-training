package code._4_student_effort.box;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Fighter(String n, int h, int d) {
        name = n;
        health = h;
        damagePerAttack = d;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
