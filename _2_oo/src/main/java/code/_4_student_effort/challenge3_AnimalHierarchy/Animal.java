package code._4_student_effort.challenge3_AnimalHierarchy;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Animalul cu " + legs + " picioare merge!");
    };
    public abstract void eat();
}
