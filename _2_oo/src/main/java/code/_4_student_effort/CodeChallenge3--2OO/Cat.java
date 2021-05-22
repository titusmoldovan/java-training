public class Cat extends Animal implements Pet {
    private String name;

    Cat(String name) {
        super(4);
        this.name = name;
    }

    public void eat() {
        System.out.println("Pisica " + name + " mananca.");
    }

    public Cat() {
        this("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Pisica " + name + " se joaca.");
    }
}
