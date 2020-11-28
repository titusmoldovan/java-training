package _4_student_effort;

public class Fighter {
    public String name ;
    public float health;
    public float damagePerAttack;

  public Fighter(){

    }
    public Fighter(String name, float health, float damage)
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack =  damage;
    }
    public void take(float damage){
      this.health = this.health - damage;
    }
    public void attack(Fighter opponent)
    {
        opponent.take(this.damagePerAttack);
    }
    public String getName(){
      return name;
    }
    public float getHealth(){
      return health;
    }
    public float getDamagePerAttack(){
      return damagePerAttack;
    }


}
