/**
 * Oana Durcau - 14.05.2021
 * A program that prints the numbers from 1 to 100, but for multiples of:
 * 3 print "Fizz"
 * 5 print "Buzz"
 * 7 print "Rizz"
 * 11 print "Jazz"
 */

package code._4_student_effort;

public class CodeChallenge1 {
    void fizzBuzz()
    {
        for(int i = 1; i <= 100; i++)
        {
            boolean isMultiple = false;
            if(i % 3 == 0)
            {
                System.out.print("Fizz");
                isMultiple = true;
            }
            if(i % 5 == 0)
            {
                System.out.print("Buzz");
                isMultiple = true;
            }
            if(i % 7 == 0)
            {
                System.out.print("Rizz");
                isMultiple = true;
            }
            if(i % 11 == 0)
            {
                System.out.print("Jazz");
                isMultiple = true;
            }

            if (isMultiple == false)
                System.out.print(i);

            if(i != 100)
            System.out.print(",");

        }
    }
}
