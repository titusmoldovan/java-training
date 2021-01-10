package clean.code.design_patterns.requirements.Championship.Championships;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.SportType;

public class BasketballChampionship extends Championship {
    public BasketballChampionship(String name) {
        super(name, SportType.BASKETBALL);
    }
}
