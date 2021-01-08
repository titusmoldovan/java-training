package pizza;

import java.util.List;
import constants.Constants;

/**
 * Hawaiian Pizza type that inherits the abstract class
 */
public class HawaiianPizza extends Pizza{
    private double price;
    private String size;
    private List<String> ingredients;

    //  Size getter
    public String getSize() {
        return size;
    }

    //  Constructor that will be used in factory
    public HawaiianPizza(double price, String size, List<String> ingredients) {
        this.price = price;
        this.size = size;
        this.ingredients = ingredients;
    }

    // Display all the ingredients this pizza contains.
    public String listHawaiianIngredients() {
        StringBuilder ingredientsList = new StringBuilder();
        int listLength = this.ingredients.size();
        for (int i = 0; i < listLength; ++i) {
            ingredientsList.append(this.ingredients.get(i));
            if (i != listLength - 1) {
                ingredientsList.append(", ");
            }
        }
        return ingredientsList.toString();
    }

    // Price getter
    @Override
    public double getPrice() {
        return this.price;
    }

    //  Print when this pizza is ordered
    @Override
    public void showPizza() {
        System.out.println("You ordered a " +
                            this.getSize() +
                            ' ' +
                            Constants.HAWAIIAN +
                            " pizza. It has the following ingredients: " +
                            this.listHawaiianIngredients() +
                            ". Total price: " +
                            this.getPrice()
        );
    }
}
