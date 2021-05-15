package com.company;

/*
Author Lutencu Octavia

FizzBuzz problem;
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<101; i++){
            list.add(i);
        }

        String string;
        string=getFormatedList(list, 3, 5, "Fizz", "Buzz");
        //string=getFormatedList(list, 7, 11, "Rizz", "Jazz");

        System.out.println(string);
    }

    static String getFormatedList(List<Integer> list, int multiples1, int multiples2, String string1, String string2){
        StringBuilder stringBuilder= new StringBuilder();
        list.forEach(x->{
            int a=(x % multiples1==0)? 1 : 0;
            int b=(x % multiples2==0)? 2 : 0;

            switch (a+b){
                case  0: stringBuilder.append(x); break;
                case  1: stringBuilder.append(string1); break;
                case  2: stringBuilder.append(string2); break;
                case  3: stringBuilder.append(string1+string2); break;
                default:
                    System.out.println("Error");;
            }
            stringBuilder.append(", ");
        });
        return stringBuilder.toString();
    }
}
