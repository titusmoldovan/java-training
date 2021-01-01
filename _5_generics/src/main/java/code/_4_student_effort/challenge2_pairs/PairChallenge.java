package code._4_student_effort.challenge2_pairs;

public class PairChallenge {

    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);


        Running runningShoe3 = new Running("RED", 41);
        Running runningShoe4 = new Running("RED", 42);
        Pair<Running> pairNotOk = new Pair<>(runningShoe3, runningShoe4);
    }
}
