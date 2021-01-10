package clean.code.design_patterns.requirements.Factories.ChampionshipFactotories;

import clean.code.design_patterns.requirements.Championship.Championships.BasketballChampionship;
import clean.code.design_patterns.requirements.Championship.Championship;

public class BasketballChampionshipFactory implements ChampionshipAbstractFactory {
    @Override
    public Championship create(String name) {
        return new BasketballChampionship(name);
    }
}
