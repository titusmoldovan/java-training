package clean.code.design_patterns.requirements.Factories.ChampionshipFactotories;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.Championship.Championships.HandballChampionship;

public class HandballChampionshipFactory implements ChampionshipAbstractFactory{
    @Override
    public Championship create(String name) {
        return new HandballChampionship(name);
    }
}
