package decorator_cofee_shop;

public class SoyMilk extends  CofeeCondimentDecorator {

    public SoyMilk(Cofee cofeeToDecorate) {
        super(cofeeToDecorate);
    }

    @Override
    public String getDescription() {
        return "Soy Milk";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
