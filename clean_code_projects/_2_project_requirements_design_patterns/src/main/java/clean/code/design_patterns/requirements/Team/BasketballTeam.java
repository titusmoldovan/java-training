package clean.code.design_patterns.requirements.Team;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.SportType;

public class BasketballTeam extends Team {

    public BasketballTeam(String name) {
        super(name, SportType.BASKETBALL);
    }

    @Override
    public void addWinPoints(Championship ch) {
        super.noOfPoints.put(ch,noOfPoints.get(ch)+5);
    }

    @Override
    public void addDrawPoints(Championship ch) {
        super.noOfPoints.put(ch,noOfPoints.get(ch)+2);

    }
}
