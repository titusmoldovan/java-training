package code._4_student_effort.ChallengeOne;

public class Fighter {
    private String name;
    private Double health=100.00;
    private Double damagePerAttack;

    public Fighter(String name, Double damagePerAttack) {
        this.name = name;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.setHealth(opponent.getHealth()-this.damagePerAttack);
    }

    public String getName() {
        return name;
    }

    public Double getHealth() {
        return health;
    }

    public Double getDamagePerAttack() {
        return damagePerAttack;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    private void setHealth(Double health) {
        this.health = health;
    }

    private void setDamagePerAttack(Double damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    @Override
    public String toString() {
        return String.format("Fighter %s has curent health: %.2f",name,health);
    }
    public void decreaseDamageAttack(int round, double factor) {
        if ((this.getHealth()) > 0.0 && (this.getDamagePerAttack() - (round * factor)) > 0.0) {
            this.setDamagePerAttack(this.getDamagePerAttack() - round * factor);
        }
    }
}
