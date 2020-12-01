package code._4_student_effort.ChallengeOne;


public class Main {
    public static void main(String[] args) {
        Fighter lucian = new Fighter("Lucian Bute",14.00);
        Fighter floyd = new Fighter("Floyd Mayweather",15.00);

        BoxingMatch mainEvent = new BoxingMatch(lucian,floyd);

        System.out.println("Winner is: "+mainEvent.fight());
    }
}
