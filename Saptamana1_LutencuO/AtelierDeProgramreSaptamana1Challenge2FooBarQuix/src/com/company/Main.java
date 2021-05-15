/*
Authot: Lutencu Octavian
Problem: FooBarQix
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer number: ");

        int number= scanner.nextInt();
        FooBarQix objectFooBarQix= new FooBarQix(number);
        String result = objectFooBarQix.compute();

        if(result.isEmpty()) System.out.println(objectFooBarQix.getNumber());
        else System.out.println(result);
    }

}
