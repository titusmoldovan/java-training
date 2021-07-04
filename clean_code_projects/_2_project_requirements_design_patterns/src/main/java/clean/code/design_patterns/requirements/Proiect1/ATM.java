package Popeiu.Roxana.Proiect1;

import java.util.Scanner;

public class ATM {


    private ATMResources lei500BanknoteNr;
    private ATMResources lei200BanknoteNr;
    private ATMResources lei100BanknoteNr;
    private ATMResources lei50BanknoteNr;
    private ATMResources lei10BanknoteNr;
    private ATMResources lei5BanknoteNr;
    private DispenseChain c1;

    public ATM(int lei500BanknoteNr, int lei200BanknoteNr, int lei100BanknoteNr, int lei50BanknoteNr, int lei10BanknoteNr, int lei5BanknoteNr) {
        // initializeaza resursele bancomatului
       this.lei500BanknoteNr =new ATMResources(lei500BanknoteNr);
        this.lei200BanknoteNr =new ATMResources(lei200BanknoteNr);
        this.lei100BanknoteNr =new ATMResources(lei100BanknoteNr);
        this.lei50BanknoteNr =new ATMResources(lei50BanknoteNr);
        this.lei10BanknoteNr =new ATMResources(lei10BanknoteNr);
        this.lei5BanknoteNr =new ATMResources(lei5BanknoteNr);
        this.c1 = new Dispenser500Lei(this.lei500BanknoteNr);
        DispenseChain c2 = new Dispenser200Lei(this.lei200BanknoteNr);
        DispenseChain c3 = new Dispenser100Lei(this.lei100BanknoteNr);
        DispenseChain c4 = new Dispenser50Lei(this.lei50BanknoteNr);
        DispenseChain c5 = new Dispenser10Lei(this.lei10BanknoteNr);
        DispenseChain c6 = new Dispenser5Lei(this.lei5BanknoteNr);

        // initializeaza bancnota urmatoare, pentru fiecare bancnota
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
    }

    public static void main(String[] args) {
        ATM atmDispenser = new ATM(1,2,3,4,5,6);
        while (true) {
            int amount = 0;
            System.out.println("Introduceti suma dorita: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 5 != 0) {
                System.out.println("Suma ar trebui sa fie multiplu de 5.");
                return;
            }
            // process the request
            if(!atmDispenser.c1.dispense(new Currency(amount)))
            {
                System.out.println("Aparatul nu are bancnote pentru a acoperi suma dorita!");
            }

        }

    }
}
