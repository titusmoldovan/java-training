package project01.decorator.domain;

public class Water extends Beverage {

    public Water() {
        super("Water", "");
    }

    @Override
    public double cost() {
        return 5;
    }
}
