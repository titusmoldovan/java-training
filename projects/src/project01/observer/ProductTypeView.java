package project01.observer;

import project01.observer.domain.Observer;
import project01.observer.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeView extends Observer implements View{
    private final Deposit deposit;
    private final List<String> products;

    public ProductTypeView(Deposit deposit) {
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
            if (!this.products.contains(product.getName()))
                this.products.add(product.getName());
        });
    }

    @Override
    public void show() {
        System.out.println("Products Type View:");
        products.forEach(System.out::println);
    }
}
