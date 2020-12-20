package code._4_student_effort.ChallengeTwo;

public class Main {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("YELLOW", 42);
        Pair<Running> pairOk = new Pair<>(runningShoe1, runningShoe2);

        Boot bootShoe = new Boot("BLACK", 45);

        //Pair<Running> pairKO = new Pair<>(runningShoe1,bootShoe); //compilation error

    }
}
