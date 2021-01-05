package project01.decorator.domain;

public class GreenTea extends Beverage {

    public GreenTea(String name, String description) {
        super(name, description);
    }

    @Override
    public double cost() {
        return 13;
    }
}
