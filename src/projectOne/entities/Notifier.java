package projectOne.entities;

import projectOne.products.Magazine;
import projectOne.products.MagazineType;

import java.util.ArrayList;
import java.util.List;

public class Notifier {

    private Magazine magazine;
    private MagazineType magazineType;
    private List<Client> subscribers = new ArrayList<>();


    public List<Client> getClients () {
        return subscribers;
    }

    public void addSubscriber (Client client) {
        this.subscribers.add(client);

    }

    public void removeSubscriber (Client client) {
        this.subscribers.remove(client);
    }

    public void setMagazine (Magazine magazine) {
        this.magazine = magazine;
        for (Client client : subscribers){
            client.update(magazine);}

    }

    public void getSubscribers() {
        System.out.println("Subscribers:");
        for(Client subscriber : subscribers) {
            System.out.println(((ConcreteClient)subscriber).getUsername());
        }
    }

    public Client searchByUsername(String username) {
        for (Client c : subscribers) {
            if (((ConcreteClient) c).getUsername().equals(username))
                return c;
        }
        return null;
    }


}


