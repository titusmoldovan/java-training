package code._4_student_effort;


public class Main {
    public static void main(String[] args) {
//        MyFizzBuzz fizzBuzz = new MyFizzBuzz();
//        for(int i=0;i<=100; i++)
//            System.out.println(fizzBuzz.fizzBuzz2(i));

//        MyFooBarQix fooBarQix = new MyFooBarQix();
//        for(int i=0;i<=101; i++)
//            System.out.println(fooBarQix.compute2(i));
//        MyPairOf2 pairOf2 = new MyPairOf2();
//        System.out.println(pairOf2.countPairs(new Integer[]{1, 2, 1, -1, 0, 0, 0}));

        MyPairOf3 pairOf3 = new MyPairOf3();
        System.out.println(pairOf3.countPairs(new Integer[]{2, -1, -1, 0, 0, 0}));
    }
}
