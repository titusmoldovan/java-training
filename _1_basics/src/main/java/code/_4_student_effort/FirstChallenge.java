package code._4_student_effort;

//stage 1 and stage 2

public class FirstChallenge {

    public static void fizzBuzz(int number) {
        if (number % 3 == 0) {
            System.out.print("Fizz");
        }
        if (number % 5 == 0) {
            System.out.print("Buzz");
        }
        if (number % 7 == 0) {
            System.out.print("Rizz");
        }
        if (number % 11 == 0) {
            System.out.print("Jazz");
        }
        if (!getOk(number)) {
            System.out.print(number);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " : ");
            fizzBuzz(i);
            System.out.println();
        }
    }

    public static boolean getOk(int number) {
        return number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || number % 11 == 0;
    }
}

