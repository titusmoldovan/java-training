package project01.decorator.view.command;

import project01.decorator.Order;

public class FinishOrder extends Command {
    public FinishOrder(String key, String description, Order order) {
        super(key, description, order);
    }

    @Override
    public void execute() {
        System.out.println(order);
        System.exit(0);
    }
}
