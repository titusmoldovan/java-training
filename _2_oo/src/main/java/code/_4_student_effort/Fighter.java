package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.setHealth(opponent.getHealth() - this.damagePerAttack);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public int getHealth() {
        return health;
    }
}
