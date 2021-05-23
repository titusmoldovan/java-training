public class challenge1
{

    public static void main(String args[])
    {
        for(int i = 1; i <= 100; ++i)
        {
            if(i % 3 == 0)
                System.out.print("Fizz");

            if(i % 5 == 0)
                System.out.print("Buzz");

            if(i % 7 == 0)
                System.out.print("Rizz");

            if(i % 11 == 0)
                System.out.print("Jazz");

            if(!(i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0))
                System.out.print(i);

            if(i != 100)
                System.out.print(", ");
        }
    }

}
