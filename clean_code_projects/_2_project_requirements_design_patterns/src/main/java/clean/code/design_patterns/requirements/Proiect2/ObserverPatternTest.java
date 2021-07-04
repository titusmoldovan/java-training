package Popeiu.Roxana.Proiect2;

import Popeiu.Roxana.Proiect1.Currency;

import java.util.Scanner;

public class ObserverPatternTest {
    public static void main(String[] args) {
        //creare subiect
        Notification notification = new Notification();

        //creati observatori
        Observer obj1 = new User("Roxana");
        Observer obj2 = new User("Bogdan");
        Observer obj3 = new User("Ana");

        //inregistrare observatori la subiect
        notification.register(obj1);
        notification.register(obj2);
        notification.register(obj3);

        //adauga useri la notificare
        obj1.setSubject(notification);
        obj2.setSubject(notification);
        obj3.setSubject(notification);

        //trimite notificarile
        obj1.update();

        while (true) {
            String notificationPost="";
            System.out.println("Introduceti textul pentru notificare: ");
            Scanner input = new Scanner(System.in);
            notificationPost = input.nextLine();
            notification.postMessage(notificationPost);

        }


    }

}
