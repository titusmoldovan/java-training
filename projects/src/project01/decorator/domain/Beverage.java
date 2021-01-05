package project01.decorator.domain;

public abstract class Beverage {
    private final String name;
    private String description;

    public Beverage(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return name + "   -" + cost() + " lei\n" + description;
    }
}
