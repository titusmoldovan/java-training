public class BoxingMatch {
    public BoxingMatch(Fighter fighter1, Fighter fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    private Fighter fighter1;
    private Fighter fighter2;

    public String fight(){
        int stop = 1;
        while(stop != 0){
            fighter1.attack(fighter2);
            //System.out.println("fighter2:"+fighter2.getHealth()); //prints for debug
            fighter2.attack(fighter1);
            //System.out.println("fighter1:"+fighter1.getHealth()); // prints for debug
            if (fighter1.getHealth() <= 0 || fighter2.getHealth() <=0)
                stop = 0;

        }

        if(fighter2.getHealth() > fighter1.getHealth())
            return fighter2.getName();
        else if (fighter1.getHealth() == fighter2.getHealth())
            return "tie";
        else return fighter1.getName();
    }
}
