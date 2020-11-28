package code._4_student_effort.animal;

public abstract class Animal {
    protected int legs;

    protected Animal(int l){
        legs = l;
    }

    abstract void eat();

    void walk() {
        System.out.println("Walks on " + legs + " legs");
    }
}
