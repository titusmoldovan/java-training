import java.util.ArrayList;

public class Burger extends Food {
    ArrayList<String> ingredients;
    Burger(String name, int price, ArrayList<String> ingredients) {
        this.type = name;
        this.price = price;
        this.ingredients = ingredients;
    }
}
