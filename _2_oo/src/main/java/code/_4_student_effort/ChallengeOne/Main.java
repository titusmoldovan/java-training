package code._4_student_effort.ChallengeOne;


public class Main {
    public static void main(String[] args) {
        Fighter lucian = new Fighter("Lucian Bute");
        Fighter floyd = new Fighter("Floyd Mayweather");

        BoxingMatch mainEvent = new BoxingMatch(lucian,floyd);
        lucian.setDamagePerAttack(14.00);
        floyd.setDamagePerAttack(15.00);

        System.out.println("Winner is: "+mainEvent.fight());
    }
}
