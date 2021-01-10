package clean.code.design_patterns.requirements.Factories.TeamFactories;

import clean.code.design_patterns.requirements.Team.FootballTeam;
import clean.code.design_patterns.requirements.Team.Team;

public class FootballTeamFactory implements TeamAbstractFactory {
    @Override
    public Team create(String name) {
        return new FootballTeam(name);
    }
}
