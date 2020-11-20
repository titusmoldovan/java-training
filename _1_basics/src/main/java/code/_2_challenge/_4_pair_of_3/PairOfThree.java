package com.Tema1_Google;

import java.util.Vector;

public class PairOfThree {
    public static Vector<Integer> v = new Vector<Integer>();

    boolean verificare_suma(int valoare_cautata, Vector<Integer> contor){
        int suma;
        for (int i = 0 ; i < contor.size()-1 ; i++ ){
            for ( int j = i+1 ; j < contor.size() ; j++ ){
                suma = contor.get(i) + contor.get(j);
                //System.out.print("[" + contor.get(i) + " " + contor.get(j) + " {" + suma + "} ] ");
                if ( suma + valoare_cautata == 0 ){
                    contor.removeElement(contor.get(j));
                    contor.removeElement(contor.get(i));
                    return true;
                }
            }
        }
        return false;
    }

    int perechiThree(){
        int contorizarePerechi = 0;
        Vector<Integer> contor = new Vector<Integer>();
        if ( v.size() <= 3 ){
            return -1;
        }
        else{
            contor.add(v.get(0));
            contor.add(v.get(1));
        }
        for ( int i = 2 ; i < v.size() ; i++ ){
            //System.out.println(contor + " " + v.get(i));
            if (!verificare_suma(v.get(i), contor)){
                contor.add(v.get(i));
            }
            else{
                contorizarePerechi++;
            }
        }
        return contorizarePerechi;
    }

    public static void main(String[] args) {
        PairOfThree obiect = new PairOfThree();
        v.add(-1);
        v.add(-1);
        v.add(-1);
        v.add(2);
        v.add(-1);
        v.add(2);
        System.out.println(v);
        System.out.println(obiect.perechiThree());
    }
}
