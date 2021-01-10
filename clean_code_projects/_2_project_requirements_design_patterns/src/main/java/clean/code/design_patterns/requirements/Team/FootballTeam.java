package clean.code.design_patterns.requirements.Team;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.SportType;

public class FootballTeam extends Team {

    public FootballTeam(String name) {
        super(name, SportType.FOOTBALL);
    }

    @Override
    public void addWinPoints(Championship ch) {
        super.noOfPoints.put(ch,noOfPoints.get(ch)+3);
    }

    @Override
    public void addDrawPoints(Championship ch) {
        super.noOfPoints.put(ch,noOfPoints.get(ch)+1);


    }
}
