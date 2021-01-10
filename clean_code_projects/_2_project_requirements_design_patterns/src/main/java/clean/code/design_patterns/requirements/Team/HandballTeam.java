package clean.code.design_patterns.requirements.Team;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.SportType;

public class HandballTeam extends Team {

    public HandballTeam(String name) {
        super(name, SportType.HANDBALL);
    }

    @Override
    public void addWinPoints(Championship ch) {
        super.noOfPoints.put(ch, noOfPoints.get(ch) + 2);
    }

    @Override
    public void addDrawPoints(Championship ch) {
        super.noOfPoints.put(ch, noOfPoints.get(ch) + 1);

    }
}
