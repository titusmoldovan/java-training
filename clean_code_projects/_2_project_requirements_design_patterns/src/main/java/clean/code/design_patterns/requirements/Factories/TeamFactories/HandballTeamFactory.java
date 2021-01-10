package clean.code.design_patterns.requirements.Factories.TeamFactories;

import clean.code.design_patterns.requirements.Team.HandballTeam;
import clean.code.design_patterns.requirements.Team.Team;

public class HandballTeamFactory implements TeamAbstractFactory {
    @Override
    public Team create(String name) {
        return new HandballTeam(name);
    }
}
