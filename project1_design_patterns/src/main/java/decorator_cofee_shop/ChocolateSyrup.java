package decorator_cofee_shop;

public class ChocolateSyrup extends CofeeCondimentDecorator {

    public ChocolateSyrup(Cofee cofeeToDecorate) {
        super(cofeeToDecorate);
    }

    @Override
    public String getDescription() {
        return "Chocolate Syrup";
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}
