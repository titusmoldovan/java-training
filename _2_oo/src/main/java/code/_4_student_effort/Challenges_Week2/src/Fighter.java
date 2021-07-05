public class Fighter {
    public Fighter(){
    }

    public Fighter(String name, float health, float damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    private String name;
    private float health;
    private float damagePerAttack;

    public void attack (Fighter opponent){
        opponent.setHealth(opponent.getHealth() - damagePerAttack);
    }

    public String getName(){
        return this.name;
    }

    public float getHealth(){
        return this.health;
    }

    public void setHealth(float newHealth){
        this.health = newHealth;
    }
}
