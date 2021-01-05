package project01.decorator;

import project01.decorator.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
    private final List<Beverage> beverages;

    public Order() {
        beverages = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public void addAddOn(AddOn addOn) {
        if (addOn instanceof Sugar)
            beverages.set(beverages.size() - 1, new Sugar(beverages.get(beverages.size() - 1)));
        else if (addOn instanceof Milk)
            beverages.set(beverages.size() - 1, new Milk(beverages.get(beverages.size() - 1)));
        else if (addOn instanceof Cookie)
            beverages.set(beverages.size() - 1, new Cookie(beverages.get(beverages.size() - 1)));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Your order: \n");
        AtomicReference<Double> cost = new AtomicReference<>((double) 0);
        beverages.forEach(beverage -> {
            stringBuilder.append(beverage.getName()).append("\n");
            cost.updateAndGet(v -> (double) (v + beverage.cost()));
        });
        stringBuilder.append("Total cost: ").append(cost);
        return stringBuilder.toString();
    }
}
