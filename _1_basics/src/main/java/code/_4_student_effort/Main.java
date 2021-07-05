package code._4_student_effort;
public class Main {
    public static void main(String[] args) {

        System.out.println("FizzBuzz stage1 ->");
        FizzBuzz.fizzBuzzStage1();
        System.out.println("FizzBuzz stage2 ->");
        FizzBuzz.fizzBuzzStage2();

        System.out.println("Pair of 2 ->");
        int[] arr = {5,9,-5,7,5};
        System.out.println(PairOf2.nrOfPairs(arr));

        System.out.println("FooBarQix ->");
        System.out.println("Number 101: " + FooBarQix.compute2(101));
        System.out.println("Number 303: " + FooBarQix.compute2(303));
        System.out.println("Number 105: " + FooBarQix.compute2(105));
        System.out.println("Number 10101: " + FooBarQix.compute2(10101));

        System.out.println("Pair of 3 ->");
        int[] arr2 = {-1,-1,-1,2};
        System.out.println(PairOf3.nrOfPairs(arr2));
    }
}
