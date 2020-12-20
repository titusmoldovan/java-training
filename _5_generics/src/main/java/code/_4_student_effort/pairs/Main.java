package code._4_student_effort.pairs;

public class Main {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Running runningShoe3 = new Running("RED", 42);
        Boot bootShoe = new Boot("BLACK", 45);
        try {
            Pair<Running> pairOk = new Pair<>(runningShoe1, runningShoe2);
            System.out.println(pairOk);
            //Pair<Running> pairKO = new Pair<Running>(runningShoe1, bootShoe); //Error
            Pair<Running> pairKO = new Pair<>(runningShoe1, runningShoe3);
            System.out.println(pairKO);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
