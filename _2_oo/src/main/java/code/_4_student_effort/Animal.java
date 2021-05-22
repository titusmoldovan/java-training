abstract class Animal {
    protected Integer legs;

    protected Animal(int legs){
        this.legs=legs;
    }
    abstract void eat();
    public void walk(){
        System.out.println("The animal walks peacefully using "+legs+" legs.");
    }
}
