public abstract class Animal {
    protected Animal(Integer legs){
        this.legs = legs;
    }
    protected Integer legs;
    public abstract void eat();
    public void walk(){
        System.out.println("This animal with "+this.legs+" legs is walking");
    }
}
