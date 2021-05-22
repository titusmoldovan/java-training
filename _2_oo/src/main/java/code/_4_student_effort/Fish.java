public class Fish extends Animal {
    Fish(){
        super(0);
    }
    @Override
    public void walk(){
        System.out.println("The fish can't walk!");
    }
    public void eat(){
        System.out.println("The fish eats worms!");
    }


}
