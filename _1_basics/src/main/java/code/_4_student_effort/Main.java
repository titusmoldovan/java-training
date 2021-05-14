package code._4_student_effort;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    CodeChallenge1 codeChallenge1 = new CodeChallenge1();
    //codeChallenge1.fizzBuzz();

    CodeChallenge2 codeChallenge2 = new CodeChallenge2();
    System.out.println(codeChallenge2.compute(15));
    System.out.println(codeChallenge2.compute(101));
    System.out.println(codeChallenge2.compute(33));
    System.out.println(codeChallenge2.compute(4));
    System.out.println(codeChallenge2.compute(53));

    CodeChallenge3 codeChallenge3 = new CodeChallenge3();
    ArrayList array = new ArrayList();
    array.add(3);
    array.add(2);
    array.add(-3);
    array.add(-2);
    array.add(3);
    array.add(0);
    System.out.println(codeChallenge3.pairof2(array));

    CodeChallenge4 codeChallenge4 = new CodeChallenge4();
    ArrayList array1 = new ArrayList();
    array1.add(-1);
    array1.add(-1);
    array1.add(-1);
    array1.add(2);
    System.out.println(codeChallenge4.pairof3(array));

  }
}