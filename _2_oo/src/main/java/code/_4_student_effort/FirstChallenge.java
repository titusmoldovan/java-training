package code._4_student_effort;

class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}

class BoxingMatch {
    private String winner;
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        fighter1.attack(fighter2);
        fighter2.attack(fighter1);

        if(fighter1.getHealth() > fighter2.getHealth()) {
            return fighter1.getName();
        } else if(fighter1.getHealth() < fighter2.getHealth()){
            return fighter2.getName();
        }
        return null;
    }
}

public class FirstChallenge {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("John", 100, 35);
        Fighter fighter2 = new Fighter("Travis", 100, 35);

        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        String winner = boxingMatch.fight();
        if(winner == null) {
            System.out.println("No winner");
            return;
        }
        System.out.println("The winner is " + winner);
    }
}
