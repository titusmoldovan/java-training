package code._4_student_effort._1_fizzbuzz;


public class FizzBuzz {

    private final int start;
    private final int stop;

    public FizzBuzz(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    public void printNumberBetweenStartAndStop() {
        /* Putting the FIZZBUZZ first because if I would have put it further in the programme, it would not have had
         * sense **/
        for (int i = start; i <= stop; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }

    public void printNumberBetweenStartAndStop(STAGE stage) {
        /* Putting the FIZZBUZZ first because if I would have put it further in the programme, it would not have had
         * sense **/
        if (stage.equals(STAGE.STAGE1)) {
            printNumberBetweenStartAndStop();
        } else {
            for (int i = start; i <= stop; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FIZZBUZZ");
                } else if (i % 3 == 0) {
                    System.out.println("FIZZ");
                } else if (i % 5 == 0) {
                    System.out.println("BUZZ");
                } else if (i % 7 == 0) {
                    System.out.println("RIZZ");
                } else if (i % 11 == 0) {
                    System.out.println("JAZZ");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}

