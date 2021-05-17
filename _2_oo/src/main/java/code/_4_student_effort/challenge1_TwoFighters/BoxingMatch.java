package code._4_student_effort.challenge1_TwoFighters;

public class BoxingMatch {
    Fighter firstFighter;
    Fighter secondFighter;

    public BoxingMatch(Fighter firstFighter,Fighter secondFighter){
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    public String fight(){
        while(firstFighter.getHealth() > 0 && secondFighter.getHealth() > 0){
            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }
        if(firstFighter.getHealth()<=0){
            return firstFighter.getName();
        }
        else{
            return secondFighter.getName();
        }
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Floyd Mayweather",100,25);
        Fighter f2 = new Fighter("Mike Tyson",100,20);
        BoxingMatch match = new BoxingMatch(f1,f2);
        System.out.println("Winner is: " + match.fight());
    }
}
