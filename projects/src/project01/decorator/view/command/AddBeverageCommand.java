package project01.decorator.view.command;

import project01.decorator.Order;
import project01.decorator.domain.*;
import project01.decorator.view.Menu;

public class AddBeverageCommand extends Command {
    private final Beverage beverage;
    private final Menu beverageMenu;

    public AddBeverageCommand(String key, String description, Beverage beverage, Order order, Menu menu) {
        super(key, description, order);
        this.beverage = beverage;
        beverageMenu = menu;
    }

    @Override
    public void execute() {
        order.addBeverage(beverage);

        AddOn sugar = new Sugar(beverage);
        AddOn milk = new Milk(beverage);
        AddOn cookie = new Cookie(beverage);
        Menu menu = new Menu();
        menu.addCommand(new ContinueOrderCommand("0", "Continue Order", order, beverageMenu));
        menu.addCommand(new AddAddOnCommand("1", sugar.getDescription(), sugar, order));
        menu.addCommand(new AddAddOnCommand("2", milk.getDescription(), milk, order));
        menu.addCommand(new AddAddOnCommand("3", cookie.getDescription(), cookie, order));
        menu.show();
    }
}
