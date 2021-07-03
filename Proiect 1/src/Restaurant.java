import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    // the restaurant must have only one instance
    // so I use a singleton lazy intiatization
    private static Restaurant instance = null;
    private static Menu menu;

    private Restaurant() { }
    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
            menu = Menu.getInstance();
        }
        return instance;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setInitialMenu() {
        Burger b1 = new Burger("Veggie", 15,
                new ArrayList<>(Arrays.asList("Rosii", "Castraveti", "Hallumi", "Masline")));
        Burger b2 = new Burger("Carnivor", 19,
                new ArrayList<>(Arrays.asList("Rosii", "Castraveti", "Carne de Pui", "Masline")));
        menu.addBurger(b1);
        menu.addBurger(b2);
        Extra sosBBQ = new Extra(2, "Sos BBQ");
        Extra porumb = new Extra(3, "Porumb");
        Extra sosCaesar = new Extra(1, "Sos Caesar");
        menu.addExtra(sosCaesar);
        menu.addExtra(sosBBQ);
        menu.addExtra(porumb);
    }
}
