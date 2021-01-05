package project01.decorator.domain;

public abstract class AddOn extends Beverage {
    protected Beverage beverage;

    public AddOn(String name, String description, Beverage beverage) {
        super(name, description);
        this.beverage = beverage;
    }
}
