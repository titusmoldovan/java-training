package clean.code.design_patterns.requirements.Championship.Championships;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.SportType;

public class FootballChampionship extends Championship {
    public FootballChampionship(String name) {
        super(name, SportType.FOOTBALL);
    }
}
