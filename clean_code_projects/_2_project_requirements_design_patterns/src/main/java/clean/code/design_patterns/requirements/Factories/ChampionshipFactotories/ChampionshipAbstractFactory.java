package clean.code.design_patterns.requirements.Factories.ChampionshipFactotories;

import clean.code.design_patterns.requirements.Championship.Championship;

public interface ChampionshipAbstractFactory {
    public Championship create(String name);
}
