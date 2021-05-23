package code._4_student_effort.Boxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingMatch {
    private List<Fighter> fighters = new ArrayList<>(2);

    BoxingMatch( List<Fighter> match ) {
        setMatch(match);
    }

    public List<Fighter> getMatch() {
        return fighters;
    }

    public void setMatch(List<Fighter> match) {
        this.fighters = match;
    }

    public  String fight() {

        while( fighters.get(0).getHealth() >= 0 && fighters.get(1).getHealth() >= 0 ) {
            fighters.get((0)).setHealth( fighters.get(0).getHealth() - fighters.get(1).getDamagePerAttack() );
            fighters.get((1)).setHealth( fighters.get(1).getHealth() - fighters.get(0).getDamagePerAttack() ) ;
        }

        if( fighters.get(0).getHealth() <= 0 )
            return fighters.get(1).getName();
        else return fighters.get(0).getName();
    }

    public static void main(String[] args) {

        List<Fighter> fighters = new ArrayList<>(2);
        fighters.add( new Fighter("One", 100, 20) );
        fighters.add( new Fighter( "Two", 100, 10));

        BoxingMatch boxMatch = new BoxingMatch( fighters );
        String result =  boxMatch.fight();
        System.out.print(result);

    }
}
