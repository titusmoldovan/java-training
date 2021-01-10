package clean.code.design_patterns.requirements.Factories.TeamFactories;

import clean.code.design_patterns.requirements.Team.BasketballTeam;
import clean.code.design_patterns.requirements.Team.Team;

public class BasketballTeamFactory implements TeamAbstractFactory {
    @Override
    public Team create(String name) {
        return new BasketballTeam(name);
    }
}
