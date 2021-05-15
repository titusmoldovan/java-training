/*
Author: Lutencu Octavian
Problem: Pair of 2
 */

package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // 3, 2, -3, -2, 3, 0
        // 1, 1, 0, -1, -1
        // 5, 9, -5, 7, -5
        List<Integer> list= List.of(5, 9, -5, 7, -5).stream()
                .filter(x-> x!=0)
                .collect(Collectors.toList());

        int sum=getSumOfElements(list);

        if(sum==0){
            System.out.println("Number of pairs: "+(list.size()/2));
        }else if(sum>0){
            System.out.println("Number of pairs: "+numberOfPairCalculateByNegativeElements(list));
        }else if (sum<0) {
            System.out.println("Number of pairs: " + numberOfPairCalculateByPositivElements(list));
        }

    }

    private static int getSumOfElements(List<Integer> elements){
        int sum=0;
        for (Integer numb: elements){
            sum+=numb;
        }
        return sum;
    }

    private static int numberOfPairCalculateByNegativeElements(List<Integer> elements){
        List<Integer> list=elements.stream()
                .filter(x->x<0)
                .collect(Collectors.toList());

        int numberOfPairs=0;
        for(Integer elem: list){
            if(elements.contains(elem*(-1))){
                numberOfPairs++;
                elements.remove(Integer.valueOf(elem*(-1)));
            }
        }
        return numberOfPairs;
    }

    private static int numberOfPairCalculateByPositivElements(List<Integer> elements){
        List<Integer> list=elements.stream()
                .filter(x->x>0)
                .collect(Collectors.toList());

        int numberOfPairs=0;
        for(Integer elem: list){
            if(elements.contains(elem*(-1))){
                numberOfPairs++;
                elements.remove(Integer.valueOf(elem*(-1)));
            }
        }
        return numberOfPairs;
    }
}
