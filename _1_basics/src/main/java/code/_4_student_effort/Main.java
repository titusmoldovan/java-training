package code._4_student_effort;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

    //Challenge1 challenge1 = new Challenge1();
    //challenge1.FizzBuzz();

    //Challenge2 challenge2 = new Challenge2();
    //System.out.println(challenge2.compute2(8));

    Challenge3 challenge3 = new Challenge3();
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(3);
    arrayList.add(2);
    arrayList.add(-3);
    arrayList.add(-2);
    arrayList.add(3);
    arrayList.add(-1);
    arrayList.add(0);
    //System.out.println(challenge3.pairOf2(arrayList));
    Challenge4 challenge4 = new Challenge4();
    System.out.println(challenge4.pairOf3(arrayList));

  }
}
