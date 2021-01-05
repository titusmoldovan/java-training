package project01.observer.view;

import project01.observer.Deposit;
import project01.observer.FullDescriptionView;
import project01.observer.ProductTypeView;
import project01.observer.domain.Product;
import project01.observer.view.command.AddCommand;
import project01.observer.view.command.ExitCommand;
import project01.observer.view.command.ShowCommand;

public class Interpreter {
    public void run() {
        Deposit deposit = new Deposit();
        FullDescriptionView fullDescriptionView = new FullDescriptionView(deposit);
        deposit.addObserver(fullDescriptionView);
        ProductTypeView productTypeView = new ProductTypeView(deposit);
        deposit.addObserver(productTypeView);

        Product product1 = new Product("Headphones", "Active Noise Cancelling Headphones Bluetooth Headphones with Microphone Deep Bass Wireless Headphones Over Ear, Comfortable Protein Earpads, 30 Hours Playtime for Travel/Work, Black");
        Product product2 = new Product("Headphones", "Foldable Noise Isolating On Ear Headphones Wired with Microphone and Volume Control, Stereo Head Phones Corded with Adjustable Headband for Computer, Laptop and Cell Phone");
        Product product3 = new Product("Headphones", "Series Stereo Headphones");
        Product product4 = new Product("Power Bank", "Ambrane 20000mAh Li-Polymer Powerbank with Fast Charging & Compact Size");
        deposit.addProduct(product1);
        deposit.addProduct(product2);
        deposit.addProduct(product3);
        deposit.addProduct(product4);

        Menu menu = new Menu();
        menu.addCommand(new ExitCommand("0", "Exit"));
        menu.addCommand(new AddCommand("1", "Add product", deposit));
        menu.addCommand(new ShowCommand("2", "Show products with full description", fullDescriptionView));
        menu.addCommand(new ShowCommand("3", "Show product types", productTypeView));
        menu.show();
    }
}
