package code._4_student_effort.Boxing;

public class Fighter {
    private String name;
    private Integer health;
    private Integer damagePerAttack;

    Fighter(String name, Integer health, Integer damagePerAttack) {
        setName(name);
        setHealth(health);
        setDamagePerAttack(damagePerAttack);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(Integer damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}
