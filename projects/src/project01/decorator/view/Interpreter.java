package project01.decorator.view;

import project01.decorator.Order;
import project01.decorator.domain.*;
import project01.decorator.view.command.AddBeverageCommand;
import project01.decorator.view.command.FinishOrder;

public class Interpreter {
    public void run() {
        Order order = new Order();
        Beverage blackTea = new BlackTea("Basic Black Tea", "Made from the Camellia sinensis leaves allowed to fully oxidize. Tends to be bold and brisk.");
        Beverage greenTea = new GreenTea("Basic Green Tea", "Made from Camellia sinensis leaves and buds that have not undergone the same withering and oxidation process used to make black teas");
        Beverage redTea = new RedTea("Basic Read Tea", "Made from Aspalathus linearis leaves. Contains many antioxidants.");
        Beverage water = new Water();
        Menu menu = new Menu();
        menu.addCommand(new FinishOrder("0", "Finish Order", order));
        menu.addCommand(new AddBeverageCommand("1", blackTea.toString(), blackTea, order, menu));
        menu.addCommand(new AddBeverageCommand("2", greenTea.toString(), greenTea, order, menu));
        menu.addCommand(new AddBeverageCommand("3", redTea.toString(), redTea, order, menu));
        menu.addCommand(new AddBeverageCommand("4", water.toString(), water, order, menu));
        menu.show();
    }
}
