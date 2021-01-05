package project01.decorator.domain;

public class RedTea extends Beverage {

    public RedTea(String name, String description) {
        super(name, description);
    }

    @Override
    public double cost() {
        return 11;
    }
}
