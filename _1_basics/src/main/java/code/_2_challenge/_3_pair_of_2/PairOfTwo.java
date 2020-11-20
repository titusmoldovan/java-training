package com.Tema1_Google;

import java.util.Vector;

public class PairOfTwo {
    int perechi(Vector<Integer> v){
        int contorizarePerechi = 0;
        Vector<Integer> contor = new Vector<Integer>();
       for ( int i = 0 ; i < v.size() ; i++ ) {
           if ( contor.contains(-v.get(i)) == false ) {
               contor.add(v.get(i));
           }
           else{
               contorizarePerechi++;
               contor.removeElement(-v.get(i));
               //System.out.println(contor);
           }
       }
       return contorizarePerechi;
    }

    public static void main(String[] args) {
        PairOfTwo obiect = new PairOfTwo();
        Vector<Integer> v = new Vector<Integer>(100);
        v.add(3);
        v.add(2);
        v.add(-3);
        v.add(-2);
        v.add(3);
        v.add(0);
        System.out.println(v);
        obiect.perechi(v);
        System.out.println(obiect.perechi(v));
        v.clear();
        v.add(1);
        v.add(1);
        v.add(0);
        v.add(-1);
        v.add(-1);
        System.out.println(v);
        System.out.println(obiect.perechi(v));
        v.clear();
        v.add(5);
        v.add(9);
        v.add(-5);
        v.add(-7);
        v.add(-5);
        System.out.println(v);
        System.out.println(obiect.perechi(v));
    }
}
