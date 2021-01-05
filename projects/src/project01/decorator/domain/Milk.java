package project01.decorator.domain;

public class Milk extends AddOn {

    public Milk(Beverage beverage) {
        super("Milk", "Milk", beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }
}
