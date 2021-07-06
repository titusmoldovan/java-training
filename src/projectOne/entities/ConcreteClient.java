package projectOne.entities;

import projectOne.products.Magazine;

public class ConcreteClient implements Client {

    private String username;
    private Magazine magazine;

    public ConcreteClient () {}

    public ConcreteClient (String username) {
        this.username = username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public String getUsername () {
        return username;
    }

    public void setMagazine (Magazine magazine) {
        this.magazine = magazine;
    }

    public Magazine getMagazine () {
        return magazine;
    }

    public void showCurrentSubscription() {
        System.out.println("You're currently subscribed to a " + magazine.getType().toString() + " magazine");
    }

    @Override
    public void update (Object o) {
        this.setMagazine((Magazine) o);
        ((Magazine) o).subscription();

    }
}
