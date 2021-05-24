package code._4_student_effort._3_animal_hierarchy;

public abstract class Animal {

    protected Integer legs;

    public Animal() {
    }

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println(this + " is walking like a " + this.getClass().getSimpleName());
    }

    public abstract void eat();


    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }
}
