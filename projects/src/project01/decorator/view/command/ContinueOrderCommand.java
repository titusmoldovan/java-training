package project01.decorator.view.command;

import project01.decorator.Order;
import project01.decorator.view.Menu;

public class ContinueOrderCommand extends Command {
    private final Menu beverageMenu;

    public ContinueOrderCommand(String key, String description, Order order, Menu menu) {
        super(key, description, order);
        beverageMenu = menu;
    }

    @Override
    public void execute() {
        beverageMenu.show();
    }
}
