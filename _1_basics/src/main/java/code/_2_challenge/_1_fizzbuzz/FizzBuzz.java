package com.Tema1_Google;

public class FizzBuzz {

    boolean is_multiple_of_three(int i){
        if ( i%3 == 0 )
            return true;
        return false;
    }

    boolean is_multiple_of_five(int i){
        if ( i%5 == 0 )
            return true;
        return false;
    }

    boolean is_multiple_of_seven(int i){
        if ( i%7 == 0 )
            return true;
        return false;
    }

    boolean is_multiple_of_eleven(int i){
        if ( i%11 == 0 )
            return true;
        return false;
    }

    public static void main(String[] args) {
        FizzBuzz obiect = new FizzBuzz();
	    for ( int i = 1 ; i <= 100 ; i++ ){
	        if ( obiect.is_multiple_of_three(i) == true && obiect.is_multiple_of_five(i) ){
                System.out.print("FizzBuzz" + ", ");
                continue;
            }
            if ( obiect.is_multiple_of_three(i) == true ){
                System.out.print("Fizz" + ", ");
                continue;
            }
            if ( obiect.is_multiple_of_five(i) == true ){
                System.out.print("Buzz" + ", ");
                continue;
            }
            if ( obiect.is_multiple_of_seven(i) == true ){
                System.out.print("Rizz" + ", ");
                continue;
            }
            if ( obiect.is_multiple_of_eleven(i) == true ){
                System.out.print("Jazz" + ", ");
                continue;
            }
	        System.out.print(i + ", ");
        }
    }
}
