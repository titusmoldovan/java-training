package com.Tema1_Google;

public class FooBarQix {
    String compute(int i){
        StringBuffer forReturn = new StringBuffer();
        int flagthree = 0;
        int flagfive = 0;
        int flagseven = 0;
        if ( i%3 == 0 ){
            forReturn.append("Foo");
        }
        if ( i%5 == 0 ){
            forReturn.append("Bar");
        }
        if ( i%7 == 0 ){
            forReturn.append("Qix");
        }
        while (i > 0){
            if ( i%10 == 3 )
                flagthree++;
            if ( i%10 == 5 )
                flagfive++;
            if ( i%10 == 7 )
                flagseven++;
            i = i/10;
        }
        while ( flagthree > 0 ){
            flagthree--;
            forReturn.append("Foo");
        }
        if ( flagfive > 0 ){
            flagfive--;
            forReturn.append("Bar");
        }
        if ( flagseven > 0 ){
            flagseven--;
            forReturn.append("Qix");
        }
        String string = forReturn.toString();
        return string;
    }

    String compute2(int i){
        StringBuffer forReturn = new StringBuffer();
        boolean steagMultipluDeCeva = false;
        int flagthree = 0;
        int flagfive = 0;
        int flagseven = 0;
        if ( i%3 == 0 ){
            forReturn.append("Foo");
            steagMultipluDeCeva = true;
        }
        if ( i%5 == 0 ){
            forReturn.append("Bar");
            steagMultipluDeCeva = true;
        }
        if ( i%7 == 0 ){
            steagMultipluDeCeva = true;
            forReturn.append("Qix");
        }
        int nr = i;
        int putere10I = 1;
        while (i >= 10) {
            putere10I = putere10I*10;
            i = i / 10;
        }
        while ( putere10I > 0 && steagMultipluDeCeva == true ){
            if ( (nr/putere10I)%10 == 3 ){
                forReturn.append("Foo");
            }
            if ( (nr/putere10I)%10 == 5 ){
                forReturn.append("Bar");
            }
            if ( (nr/putere10I)%10 == 7 ){
                forReturn.append("Qix");
            }
            if ( (nr/putere10I)%10 == 0 ){
                forReturn.append("*");
            }
            putere10I = putere10I / 10;
        }

        while ( putere10I > 0 && steagMultipluDeCeva == false ){
            if ( (nr/putere10I)%10 == 0 ){
                forReturn.append("*");
            }
            else{
                int x = nr/putere10I%10;
                forReturn.append(x);
            }
            putere10I = putere10I / 10;
        }

        String string = forReturn.toString();
        return string;
    }

    public static void main(String[] args) {
        FooBarQix obiect = new FooBarQix();
        for ( int i = 1 ; i <= 100 ; i++ ){
            if ( obiect.compute(i).contentEquals("") ){
                System.out.println(i + " => " + i);
            }
            else {
                System.out.println(i + " => " + obiect.compute(i));
            }
        }
        System.out.println();
        System.out.println(obiect.compute2(101));
        System.out.println(obiect.compute2(303));
        System.out.println(obiect.compute2(105));
        System.out.println(obiect.compute2(10101));
    }
}
