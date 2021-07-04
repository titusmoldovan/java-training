import java.util.List;

public class PizzaWithToppings implements PizzaDecorator {
    Pizza pizza;
  List<Toppings> toppings;

    public PizzaWithToppings(Pizza pizza, List<Toppings> toppings) {
        this.pizza = pizza;
        this.toppings = toppings;
    }

    @Override
    public String getDescription() {
        int nr=0;
        String result=pizza.getDescription()+" and toppings:";
        for (Toppings t:toppings) {
            nr++;
            result+=" "+t;
            if(nr!=toppings.stream().count())
                result+=",";
            else result+=".";

        }
        return result;
    }

    @Override
    public double getPrice() {
        double result=pizza.getPrice();
        for (Toppings t:toppings) {
            result+=t.getToppingsId();

        }
        return result;
    }

}
