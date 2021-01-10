package clean.code.design_patterns.requirements.Championship;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    private Integer noStage;
    private Championship championship;
    private List<Match> matches = new ArrayList<>();

    public Stage(Integer noStage, Championship championship) {
        this.noStage = noStage;
        this.championship = championship;
        championship.addStage(this);
    }

    public void addMatches(Match match) {
        matches.add(match);
    }

    public List<Match> getMatches() {
        return matches;
    }

    public Integer getNoStage() {
        return noStage;
    }

    public Championship getChampionship() {
        return championship;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "noStage=" + noStage +
                '}';
    }
}
