package project01.decorator.view.command;

import project01.decorator.Order;
import project01.decorator.domain.AddOn;

public class AddAddOnCommand extends Command {
    private final AddOn addOn;

    public AddAddOnCommand(String key, String description, AddOn addOn, Order order) {
        super(key, description, order);
        this.addOn = addOn;
    }

    @Override
    public void execute() {
        order.addAddOn(addOn);
    }
}
