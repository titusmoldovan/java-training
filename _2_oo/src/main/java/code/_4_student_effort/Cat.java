public class Cat extends Animal implements Pet{
    private String name;

    Cat(String name){
        super(4);
        this.name=name;
    }
    Cat(){
        this(" ");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println("The cat plays outdoors.");
    }
    public void eat(){
        System.out.println("The cat eats mice.");
    }

}
