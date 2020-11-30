package code._4_student_effort;

// import java.util.function.Function;

public class Challenge2 {

    public static void  main (String[] args){

        int numar = 105;

        if(numar % 3 == 0){
            System.out.print("Foo");
        }
        if(numar % 5 == 0){
            System.out.print("Bar");
        }
        if(numar % 7 == 0){
            System.out.print("Qix");
        }
        while(numar>0){
            if(numar % 10 == 0){
                System.out.print("*");
            }
            if(numar % 10 == 3){
                System.out.print("Foo");
            }
            if(numar % 10 == 5){
                System.out.print("Bar");
            }
            if(numar % 10 == 7){
                System.out.print("Qix");
            }

            numar = numar/10;
        }

        }
    }

