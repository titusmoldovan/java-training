package code._4_student_effort.ChallengeOne;

public class FizzBuzz {

    public static String fizzBuzz(Integer key){
        if(key % 3 == 0 && key % 5 == 0)
            return "FizzBuzz";
        else if (key % 3 == 0)
            return "Fizz";
        else if(key % 5 == 0 )
            return "Buzz";
        else
            return key.toString();
    }
    public static String fizzBuzz2(Integer key){
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Stage 1: ");
        for(int i = 1 ; i <=100; i ++ ){
            System.out.print(fizzBuzz(i)+",");
        }
    }


}
