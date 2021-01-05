package project01.decorator.domain;

public class BlackTea extends Beverage {

    public BlackTea(String name, String description) {
        super(name, description);
    }

    @Override
    public double cost() {
        return 15;
    }
}
