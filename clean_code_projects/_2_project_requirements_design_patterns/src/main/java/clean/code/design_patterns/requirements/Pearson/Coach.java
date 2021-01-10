package clean.code.design_patterns.requirements.Pearson;

import clean.code.design_patterns.requirements.SportType;
import clean.code.design_patterns.requirements.Team.Team;

public class Coach extends Person {
    private SportType sportType;
    private Team currentTeam;

    public Coach(String firstName, String lastName, Integer age, SportType sportType) {
        super(firstName, lastName, age);
        this.sportType = sportType;
    }

    public Team getTeam() {
        return currentTeam;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setTeam(Team team) {
        this.currentTeam = team;
    }
}
