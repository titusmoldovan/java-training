package designPatternsProject;

import delivery.*;
import pizza.*;

import java.util.Scanner;

import static constants.Constants.*;

/**
 * Main method. Testing the design patterns I implemented: Factory and Strategy.
 * For this project I simulated a pizza delivery application. The user must choose a city where the
 * pizza will be delivered, then a type and a size for the pizza he wants. All choices are from
 * given lists and any choice not from a list will result in throwing a exception. Input of this
 * choices is case sensitive. If everything is alright at the end is displayed a success message
 * showing the ordered pizza, its ingredients, its price and the time it will be delivered in the
 * chosen city.
 */
public class Main {

    public static void main(String[] args) {
        // Scanner used for input data into the program
        Scanner scanner = new Scanner(System.in);

        //  Display greeting message and select a city
        System.out.println("Welcome to our pizza restaurant! Please note that we currently operate"
                + " only in Bucharest, Pitesti and Ploiesti. \n"
                + "If you want to order something please"
                + " write your city first.");
        String myCity = scanner.nextLine();

        // Select a pizza type
        System.out.println("Choose a pizza type: Hawaiian, Rustica, Supreme");
        String myType = scanner.nextLine();

        //  Select a pizza size
        System.out.println("Now please choose a pizza size: large, medium, small");
        String size = scanner.nextLine();

        //  Create the chosen pizza
        Pizza myPizza =
                PizzaFactory.createPizza(myType,  size);

        //  Pizza delivery strategy depending on the city the user selected
        Delivery delivery = switch (myCity) {
            case BUCHAREST -> new BucharestDelivery();
            case PLOIESTI -> new PloiestiDelivery();
            case PITESTI -> new PitestiDelivery();
            default -> throw new IllegalStateException("Unknown city" + myCity);
        };

        //  Show to ordered pizza
        myPizza.showPizza();
        //  Display Thank You message and the estimated delivery time (a different time for every city)
        delivery.deliverPizza();

    }
}
