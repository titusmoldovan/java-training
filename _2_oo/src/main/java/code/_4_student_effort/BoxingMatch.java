package code._4_student_effort;

public class BoxingMatch {
    Fighter f1, f2;
    BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    String fight() {
        while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            f1.attack(f2);
            System.out.println("first: " + f1.getHealth());
            f2.attack(f1);
            System.out.println("second: " + f2.getHealth());
        }
        System.out.println("first: " + f1.getHealth());
        System.out.println("second: " + f2.getHealth());
        if (f2.getHealth() <= 0) {
            return "First fighter won";
        } else {
            return "Second fighter won";
        }
    }
}
