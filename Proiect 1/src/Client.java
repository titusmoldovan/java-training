import java.util.ArrayList;

public class Client {
    private int money;
    public String orderFromMenu;
    public ArrayList<String> extras;

    public Client(int money, String orderFromMenu, ArrayList<String> extras) {
        this.money = money;
        this.orderFromMenu = orderFromMenu;
        this.extras = extras;
    }

    public void pay(int price) {
        money -= price;
        System.out.println("POS: Comanda platita! Mai aveti " + money + " lei in cont.");
    }

    public int checkAccount() {
        return money;
    }
}
