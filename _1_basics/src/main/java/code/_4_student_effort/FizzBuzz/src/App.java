//Tae Andreea-Cristina - challenges 1 to 4
//The second challenge (FooBarQix) wasn't completed successfully, didn't manage to replace character with Foo/Bar/Qix
// (point 4. in challenge)

public class App {
    public static void main(String[] args) {
        //Challenge 1 - FizzBuzz
        FizzBuzz obj_test1 = new FizzBuzz();
        obj_test1.fizzbuzz_fc();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Challenge 2 - FoorBarQix
        FooBarQix obj_test2 = new FooBarQix();
        obj_test2.compute(13);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Challenge 3 - Pair of Two
        int[] arr ={3,2,-3,-2,3,0};
        Pair_of_Two obj_test3 = new Pair_of_Two();
        int nr_perechi = obj_test3.pair(arr);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Challenge 4 - Pair of Three
        int [] arr2 = {-3,5,2,-1,-4,7,3,1,2};
        Pair_of_Three obj_test4 = new Pair_of_Three();
        int nr_perechi3 = obj_test4.pair(arr2);

    }
}

