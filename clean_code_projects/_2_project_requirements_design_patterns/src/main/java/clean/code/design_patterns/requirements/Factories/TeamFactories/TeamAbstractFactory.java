package clean.code.design_patterns.requirements.Factories.TeamFactories;

import clean.code.design_patterns.requirements.Team.Team;

public interface TeamAbstractFactory {
    public Team create(String name);
}
