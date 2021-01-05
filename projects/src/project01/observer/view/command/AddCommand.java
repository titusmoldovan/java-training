package project01.observer.view.command;

import project01.observer.Deposit;
import project01.observer.domain.Product;

import java.util.Scanner;

public class AddCommand extends Command {
    private final Deposit deposit;

    public AddCommand(String key, String description, Deposit deposit) {
        super(key, description);
        this.deposit = deposit;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        deposit.addProduct(new Product(name, description));
    }
}
