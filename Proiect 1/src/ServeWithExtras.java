public class ServeWithExtras implements Strategy {
    @Override
    public void serve(Client client) {
        int price = 0;
        for (Burger b : Restaurant.getInstance().getMenu().getBurgers()) {
            if (b.type.equals(client.orderFromMenu)) {
                price = b.price;
            }
        }
        for (Extra e : Restaurant.getInstance().getMenu().getExtras()) {
            for (String cerut : client.extras) {
                if (cerut.equals(e.type))
                    price += e.price;
            }
        }
        if (price == 0) {
            System.out.println("Eroare! Nu a fost gasit burger-ul in meniu!");
        } else {
            System.out.print("Chelner: Trebuie platita suma de " + price + " lei pentru comanda de "
                    + client.orderFromMenu + " cu ");
            for (String e : client.extras) {
                System.out.print(e + " ");
            }
            System.out.println();
            if (client.checkAccount() - price > 0)
                client.pay(price);
            else {
                System.out.println("Nu s-a plasat comanda. Nu aveti suficienti bani in cont!");
                client.checkAccount();
            }
        }
    }
}
