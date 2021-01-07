package decorator_cofee_shop;

public class CofeeOrderingSystem {

    public static void main(String[] args) {

        CafeLatte chocolateAndCaramelCafeLatte = new CafeLatte();

        ChocolateSyrup chocolateSyrup=new ChocolateSyrup(chocolateAndCaramelCafeLatte);
        CaramelSyrup caramelSyrup=new CaramelSyrup(chocolateAndCaramelCafeLatte);

        System.out.println(chocolateAndCaramelCafeLatte.getCost());
        System.out.println(chocolateAndCaramelCafeLatte.getDescription());
    }
}
