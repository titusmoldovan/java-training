package project01.decorator.domain;

public class Cookie extends AddOn {

    public Cookie(Beverage beverage) {
        super("Cookie", "Cookie", beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " + cookie";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }
}
