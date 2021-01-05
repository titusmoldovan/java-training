package project01.observer;

import project01.observer.domain.Observable;
import project01.observer.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class Deposit extends Observable {
    private final List<Product> products;

    public Deposit() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers();
    }

    public List<Product> getProducts() {
        return products;
    }
}
