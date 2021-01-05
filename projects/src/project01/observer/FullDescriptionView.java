package project01.observer;

import project01.observer.domain.Observer;
import project01.observer.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class FullDescriptionView extends Observer implements View {
    private final Deposit deposit;
    private final List<List<String>> products;

    public FullDescriptionView(Deposit deposit) {
        this.deposit = deposit;
        products = new ArrayList<>();
    }

    @Override
    public void update() {
        this.initialize();
    }

    private void initialize() {
        this.products.clear();
        List<Product> products = deposit.getProducts();
        products.forEach(product -> {
            List<String> p = new ArrayList<>();
            p.add(product.getName());
            p.add(product.getDescription());
            this.products.add(p);
        });
    }

    @Override
    public void show() {
        System.out.println("Full Description View:");
        products.forEach(product -> System.out.println(product.get(0) + " " + product.get(1)));
    }
}
