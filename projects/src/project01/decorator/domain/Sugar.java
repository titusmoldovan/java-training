package project01.decorator.domain;

public class Sugar extends AddOn {

    public Sugar(Beverage beverage) {
        super("sugar", "Sugar", beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
