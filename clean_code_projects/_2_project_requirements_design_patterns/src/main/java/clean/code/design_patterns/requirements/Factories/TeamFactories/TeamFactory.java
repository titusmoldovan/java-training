package clean.code.design_patterns.requirements.Factories.TeamFactories;

import clean.code.design_patterns.requirements.Team.Team;

public class TeamFactory {
    public static Team getTeam(TeamAbstractFactory t, String name){
        return t.create(name);
    }
}
