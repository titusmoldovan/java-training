package code._4_student_effort._1_fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz1 = new FizzBuzz(1, 100);
        fizzBuzz1.printNumberBetweenStartAndStop();
        FizzBuzz fizzBuzz2 = new FizzBuzz(1, 100);
        fizzBuzz2.printNumberBetweenStartAndStop(STAGE.STAGE2);
    }
}
