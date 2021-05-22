public class BoxingMatch {
    Fighter f1,f2;
    public BoxingMatch(Fighter f1, Fighter f2){
        this.f1=f1;
        this.f2=f2;
    }
    public String fight(){
    while(f1.getHealth()>0 && f2.getHealth()>0){
         f1.attack(f2);
         f2.attack(f1);
    }
    if(f1.getHealth() > f2.getHealth())
        return "The winner is " + f1.getName();
    else if(f1.getHealth() < f2.getHealth())
        return "The winner is " + f2.getName();
    else
        return "It's a tie!";
    }
    public static void main (String[] args){
    Fighter firstFighter=new Fighter("Mike Tyson",61,24);
    Fighter secondFighter=new Fighter("Floyd Mayweather",48,30);

    BoxingMatch boxingMatch=new BoxingMatch(firstFighter,secondFighter);
    System.out.println(boxingMatch.fight());
    }
}
