import java.util.ArrayList;
import java.util.List;

public class Delivery implements Observable{
    private List<Observer> clients = new ArrayList<Observer>();
    List<Order> orders;

    public Delivery() {
    }

    public Delivery(List<Observer> clients, List<Order> orders) {
        this.clients = clients;
        this.orders = orders;
    }

    @Override
    public void addObserver(Observer o) {
        clients.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    clients.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer client:clients) {
            System.out.println(client.toString());
            client.update();

            
        }
    }
}
