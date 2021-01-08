package pizza;

import java.util.List;

/**
 * Abstract class used in factory.
 */
public abstract class Pizza {
    //  Pizza price.
    private double price;
    //  Pizza size.
    private String size;
    //  Pizza ingredients.
    private List<String> ingredients;
    // Method to find the price of the pizza.
    public abstract double getPrice();
    // Method to display the ordered pizza.
    public abstract void showPizza();
}
