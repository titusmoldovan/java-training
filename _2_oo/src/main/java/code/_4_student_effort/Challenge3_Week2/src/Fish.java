public class Fish extends Animal {
    public Fish(Integer legs){
        super(0);
    }
    public Fish(){
        this(0);
    }
    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs");
        super.walk(); //experimenting; prints: "This animal with 0 legs is walking"
    }
    public void eat(){
        System.out.println("This fish is eating. Blub blub");
    }
}
