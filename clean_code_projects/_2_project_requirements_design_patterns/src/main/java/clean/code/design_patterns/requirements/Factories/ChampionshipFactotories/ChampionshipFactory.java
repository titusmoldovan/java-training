package clean.code.design_patterns.requirements.Factories.ChampionshipFactotories;

import clean.code.design_patterns.requirements.Championship.Championship;

public class ChampionshipFactory {
    public static Championship getChampionship(ChampionshipAbstractFactory c, String name){
        return c.create(name);
    }
}
