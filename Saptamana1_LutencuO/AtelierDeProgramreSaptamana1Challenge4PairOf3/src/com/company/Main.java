package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(-1, -1, -1, 2);
        List<Integer> listWithoutZerous= list.stream()
                .filter(x-> x!=0)
                .collect(Collectors.toList());

        List<Integer> pozitiveNumbers=listWithoutZerous.stream()
                .filter(x-> x>0)
                .sorted().collect(Collectors.toList());

        List<Integer> negativeNumbers=listWithoutZerous.stream()
                .filter(x->x<0)
                .map(x->x*(-1))
                .sorted()
                .collect(Collectors.toList());

        int numberOfPairs=findPairs(pozitiveNumbers, negativeNumbers);
        numberOfPairs+=findPairs(negativeNumbers, pozitiveNumbers);

        System.out.println("Number of Pairs: "+numberOfPairs);
    }

    private static int findPairs(List<Integer> list1, List<Integer> list2){
        if(list1.isEmpty() || list2.isEmpty()) return 0;
        int numberOfPairs=0;
        int lenghtList1=list1.size();
        int min= list2.get(0);
        int max= list2.get(list2.size()-1);
        List<Integer> elementsThatNeedToRemoveByJ= new ArrayList<>();
        List<Integer> elementsThatNeedToRemoveByI= new ArrayList<>();

        for(int i= 0; i<lenghtList1; i++){
            if(list2.isEmpty()) break;
            for(int j=i+1; j<lenghtList1; j++){
                int sum=list1.get(i)+list1.get(j);
                if(sum<min) continue;
                if(sum>max) break;
                if(list2.contains(sum)){
                    numberOfPairs++;
                    list2.remove(Integer.valueOf(sum));
                    elementsThatNeedToRemoveByJ.add(list1.get(j));
                }
            }
            if(!elementsThatNeedToRemoveByJ.isEmpty()) elementsThatNeedToRemoveByI.add(list1.get(i));
            elementsThatNeedToRemoveByJ.forEach(x->{
                list1.remove(Integer.valueOf(x));
            });
        }
        elementsThatNeedToRemoveByI.forEach(x->{
            list1.remove(Integer.valueOf(x));
        });
        return numberOfPairs;
    }
}
