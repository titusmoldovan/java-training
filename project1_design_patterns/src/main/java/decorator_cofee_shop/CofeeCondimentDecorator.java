package decorator_cofee_shop;

public abstract class CofeeCondimentDecorator extends Cofee {

    Cofee cofeeToDecorate;

    public CofeeCondimentDecorator(Cofee cofeeToDecorate) {
        cofeeToDecorate.setCost(cofeeToDecorate.cost + this.getCost());
        cofeeToDecorate.setDescription(cofeeToDecorate.getDescription() + ", " + this.getDescription());
        this.cofeeToDecorate = cofeeToDecorate;
    }
}
