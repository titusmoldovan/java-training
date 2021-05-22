public class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public void eat() {
        System.out.println("Pestele " + name + " mananca.");
    }

    public void walk() {
        System.out.println("Pestele nu poate merge.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Pestele " + name + " se joaca.");
    }
}
