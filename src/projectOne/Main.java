package projectOne;

import projectOne.entities.Admin;
import projectOne.entities.Client;
import projectOne.entities.ConcreteClient;
import projectOne.entities.Notifier;
import projectOne.exceptions.TypeNotFoundException;
import projectOne.products.Magazine;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Magazine> magazineStock = new ArrayList<>();
        Notifier observable = new Notifier();
        Admin admin = Admin.getInstance();

        while (true) {
            String command = scanner.nextLine();
            String[] parsedCommand = command.split(" ");

            switch (parsedCommand[0].toLowerCase()) {
                case "show": {
                    admin.showStock(magazineStock);
                    break;
                }
                case "exit": {
                    return;
                }

                case "current": {
                    ConcreteClient c = (ConcreteClient) observable.searchByUsername(parsedCommand[2]);
                    if(c != null && c.getMagazine() != null){
                        System.out.println("The client with username " + "\"" + c.getUsername() + "\"" +
                                                   " is " + "currently subscribed to a " +
                                                   c.getMagazine().getType().toString() +
                                                   " magazine ");}
                    else
                        System.out.println("The client you are looking for does not exist.");
                    break;
                }

                case "add": {
                    try {

                        admin.addToStock(parsedCommand[1], magazineStock);
                        for(Client c : observable.getClients()){
                            ((ConcreteClient) c).setMagazine(magazineStock.get(magazineStock.size() - 1));
                        }
                        break;

                    } catch (TypeNotFoundException e) {
                        System.out.println(e.toString());
                        break;
                    }
                }

                case "clients" : {
                    observable.getSubscribers();
                    break;
                }

                case "register" : {
                    Client client = new ConcreteClient(parsedCommand[1]);
                    observable.addSubscriber(client);
                    if(!magazineStock.isEmpty())
                        observable.setMagazine(magazineStock.get(magazineStock.size() - 1));
                    break;

                }

                case "delete": {
                    admin.deleteFromStock(parsedCommand[1], parsedCommand[2], magazineStock);
                    break;
                }

                default: {
                    System.out.println("Please enter a valid type");
                }
            }
        }
    }

}
