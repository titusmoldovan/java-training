package decorator_cofee_shop;

public class CaramelSyrup extends CofeeCondimentDecorator {

    public CaramelSyrup(Cofee cofeeToDecorate) {
        super(cofeeToDecorate);
    }

    @Override
    public String getDescription() {
        return "Caramel Syrup";
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}
