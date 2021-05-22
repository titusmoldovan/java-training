public class Fighter {
    private int health, damagePerAttack;
    private  String name;
    RandomNumber rand = new RandomNumber();

    Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }

    int getDamagePerAttack() {
        return damagePerAttack;
    }

    void setHealth(int newHealth) {
        health = newHealth;
    }

    void displayStats() {
        System.out.println("Name: " + getName() + " Health: " + getHealth() + " Damage per Attack: " + getDamagePerAttack());
    }

    void attack(Fighter opponent) {
        System.out.print(opponent.getName() + " gets attacked by " + getName() + ". ");
        int randomNumber = rand.getRandomNumber();
        int damageDealt = getDamagePerAttack();
        if (randomNumber <= 1) {
            System.out.println(opponent.getName() + " dodged " + getName() + "'s attack.");
            return;
        }
        if (randomNumber >= 8) {
            System.out.println(getName() + " deals a critical hit, doubling his damage. " + opponent.getName() + " receives " + damageDealt * 2 + " damage");
            opponent.setHealth(opponent.health - (damageDealt * 2));
            if (opponent.getHealth() < 1)
                return;
            System.out.println(opponent.getName() + " remaining health : " + opponent.getHealth());
        }
        if (randomNumber > 1 && randomNumber < 8) {
            System.out.println(" and receives " + getDamagePerAttack() + " damage.");
            opponent.setHealth(opponent.health - damageDealt);
            if (opponent.getHealth() < 1)
                return;
            System.out.println(opponent.getName() + " remaining health : " + opponent.getHealth());
        }
    }
}
