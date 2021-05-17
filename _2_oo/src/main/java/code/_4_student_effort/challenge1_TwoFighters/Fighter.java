package code._4_student_effort.challenge1_TwoFighters;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public Fighter(String name , int health , int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAttack;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }

}
