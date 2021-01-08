package pizza;

import static constants.Constants.*;

/**
 * Factory Design Pattern used to create pizza objects according to their type and size.
 */
public class PizzaFactory {
    /**
     * Creator method. Firstly I check the type of pizza I want of return, then I create that pizza
     * of the size given as argument.
     * @param pizzaType the type of pizza
     * @param pizzaSize the size of pizza
     * @return the desired pizza
     */
    public static Pizza createPizza(String pizzaType,
                                    String pizzaSize) {
        // The pizza that will be returned
        Pizza myPizza;
        switch (pizzaType) {
            //  Create hawaiian type
            case HAWAIIAN -> {
                //  Create the said pizza according to the given size
                switch (pizzaSize) {
                    case LARGE -> myPizza = new HawaiianPizza(
                        LARGE_PRICE + HAWAIIAN_ADDON,
                        LARGE,
                        HAWAIIAN_INGREDIENTS);
                    case MEDIUM -> myPizza = new HawaiianPizza(
                            MEDIUM_PRICE + HAWAIIAN_ADDON,
                            MEDIUM,
                            HAWAIIAN_INGREDIENTS);
                    case SMALL -> myPizza = new HawaiianPizza(
                            SMALL_PRICE + HAWAIIAN_ADDON,
                            SMALL,
                            HAWAIIAN_INGREDIENTS);
                    default -> throw new IllegalStateException("Unexpected value: " + pizzaSize);
                }
            }
            //  Same approach for rustica pizza
            case RUSTICA -> {
                switch (pizzaSize) {
                    case LARGE -> myPizza = new RusticaPizza(
                            LARGE_PRICE + RUSTICA_ADDON,
                            LARGE,
                            RUSTICA_INGREDIENTS);
                    case MEDIUM -> myPizza = new RusticaPizza(
                            MEDIUM_PRICE + RUSTICA_ADDON,
                            MEDIUM,
                            RUSTICA_INGREDIENTS);
                    case SMALL -> myPizza = new RusticaPizza(
                            SMALL_PRICE + RUSTICA_ADDON,
                            SMALL,
                            RUSTICA_INGREDIENTS);
                    default -> throw new IllegalStateException("Unexpected value: " + pizzaSize);
                }
            }
            //  Same approach for supreme pizza
            case SUPREME -> {
                switch (pizzaSize) {
                    case LARGE -> myPizza = new SupremePizza(
                            LARGE_PRICE + SUPREME_ADDON,
                            LARGE,
                            SUPREME_INGREDIENTS);
                    case MEDIUM -> myPizza = new SupremePizza(
                            MEDIUM_PRICE + SUPREME_ADDON,
                            MEDIUM,
                            SUPREME_INGREDIENTS);
                    case SMALL -> myPizza = new SupremePizza(
                            SMALL_PRICE + SUPREME_ADDON,
                            SMALL,
                            SUPREME_INGREDIENTS);
                    default -> throw new IllegalStateException("Unexpected value: " + pizzaSize);
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + pizzaSize);
        }

        //  Return the pizza the user chooses.
        return myPizza;
    }
}
