package _4_student_effort;

public class BoxingMatch {
   public Fighter fieghter1 ;
   public Fighter fieghter2;

    public BoxingMatch(Fighter f1, Fighter f2){
        this.fieghter1 = f1;
        this.fieghter2 = f2;
    }

    public String fight(Fighter f1, Fighter f2){
        while (f1.getHealth() > 0 &&  f2.getHealth() > 0){
            f2.attack(f1);
            if(f1.getHealth() <= 0 || f2.getHealth() <= 0)
                break;
            else
                f1.attack(f2);

        }
        if(f1.getHealth() < f2.getHealth())
            return f2.getName();
        else
            return f1.getName();
    }
}
