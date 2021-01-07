package decorator_cofee_shop;

public class CoconutMilk extends CofeeCondimentDecorator {

    public CoconutMilk(Cofee cofeeToDecorate) {
        super(cofeeToDecorate);
    }

    @Override
    public String getDescription() {
        return "Coconut Milk";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
