package code._4_student_effort._1_two_fighters;

public class BoxingMatch {

    public BoxingMatch() {
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("boxer1", 100, 15);
        Fighter fighter2 = new Fighter("boxer2", 180, 10);
        BoxingMatch boxingMatch = new BoxingMatch();
        System.out.println(boxingMatch.fight(fighter1, fighter2));
    }

    public String fight(Fighter fighter1, Fighter fighter2) {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() >0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.getHealth() <= 0) {
            return fighter2.getName();
        } else return fighter1.getName();
    }

}
