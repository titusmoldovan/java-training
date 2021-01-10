package clean.code.design_patterns.requirements.Factories.ChampionshipFactotories;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.Championship.Championships.FootballChampionship;

public class FootballChampionshipFactory implements ChampionshipAbstractFactory{
    @Override
    public Championship create(String name) {
        return new FootballChampionship(name);
    }
}
