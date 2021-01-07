package code._2_challenge._2_foobarqix;

public class FooBarQuix_Ana {
    public static void main(String[] args) {


        for(int i=1; i<=100;i++)
        {
             if(i%3==0||(i%10)%3==0|| (i%100)%3==0)
                System.out.println("Foo");
            else if(i%5==0||(i%10)%5==0|| (i%100)%5==0)
                System.out.println("Bar");
            else if(i%7==0||(i%10)%7==0|| (i%100)%7==0)
                System.out.println("Qix");

            else
                System.out.println(i);
        }

    }
}
