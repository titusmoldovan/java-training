public class Cat extends Animal implements Pet{
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }
    private String name;
    public void eat(){
        System.out.println("This cat is eating. Crunch crunch");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("This cat is playing. Meow meow scratch bite");
    }
}
