package code._4_student_effort.box;


public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        fighter1 = f1;
        fighter2 = f2;
    }

    public String fight() {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter2.getHealth() <= 0)
            return fighter1.getName();
        return fighter2.getName();
    }

    public static void main(String[] args) {
        BoxingMatch match = new BoxingMatch(new Fighter("A", 100, 11), new Fighter("B", 100,65));
        System.out.println(match.fight());
    }
}
