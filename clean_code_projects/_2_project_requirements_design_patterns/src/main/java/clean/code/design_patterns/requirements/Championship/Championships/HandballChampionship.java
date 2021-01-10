package clean.code.design_patterns.requirements.Championship.Championships;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.SportType;

public class HandballChampionship extends Championship {
    public HandballChampionship(String name) {
        super(name, SportType.HANDBALL);
    }
}
