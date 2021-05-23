package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FooBarQix {
    private StringBuilder stringBuilder;
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public FooBarQix(Integer number){
        this.number=number;
        this.stringBuilder=new StringBuilder();
    }

    private void divizibleByTreeFiveSeven(int number){
        if(number==0) return;
        if(number%3==0) this.stringBuilder.append("Foo");
        if(number%5==0) this.stringBuilder.append("Bar");
        if(number%7==0) this.stringBuilder.append("Qix");
    }

    public String compute(){
        int auxNumber= this.number;
        List<Integer> list= new ArrayList<>();
        this.divizibleByTreeFiveSeven(number);

        while(auxNumber>0){
            list.add(auxNumber%10);
            auxNumber/=10;
        }
        Collections.reverse(list);
        list.forEach(this::divizibleByTreeFiveSeven);

        return this.stringBuilder.toString();
    }
}
