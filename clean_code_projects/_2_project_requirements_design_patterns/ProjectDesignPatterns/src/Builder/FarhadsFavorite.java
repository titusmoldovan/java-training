package Builder;
import java.util.ArrayList;
import java.util.Collections;


public class FarhadsFavorite extends PizzaBuilder {

    public void buildCrust() {
        pizza.setCrust("thin");
    }

    public void buildSauce() {
        pizza.setSauce("normal marinara");
    }

    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings, "mozzarella cheese", "sausage", "chicken", "tomato");
        pizza.setToppings(toppings);
    }

}