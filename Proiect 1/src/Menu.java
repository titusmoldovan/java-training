import java.util.ArrayList;

public class Menu {
    // every restaurant has only one menu => singleton
    private static Menu instance = null;
    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<Extra> extras = new ArrayList<>();

    private Menu() { }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    void addExtra(Extra extra) {
        extras.add(extra);
    }

    void addBurger(Burger burger) {
        burgers.add(burger);
    }

    public ArrayList<Burger> getBurgers() {
        return burgers;
    }

    public ArrayList<Extra> getExtras() {
        return extras;
    }

    String seeMenu() {
        StringBuilder menu = new StringBuilder();
        if (burgers.size() == 0) {
            return "Out of stock!";
        }
        for (Burger b : burgers) {
            menu.append(b.type);
            menu.append(" ");
            menu.append(b.price);
            menu.append(" lei\n");
            if (b.ingredients.size() != 0) {
                menu.append("Contains: ");
                for (String ingredient : b.ingredients) {
                    menu.append(ingredient);
                    menu.append(" ");
                }
                menu.append("\n");
            }
        }
        if (extras.size() == 0)
            return menu.toString();
        for (Extra e : extras) {
            menu.append(e.type);
            menu.append(" ");
            menu.append(e.price);
            menu.append(" lei\n");
        }
        return menu.toString();
    }
}
