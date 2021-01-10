package clean.code.design_patterns.requirements.Championship;

import clean.code.design_patterns.requirements.SportType;
import clean.code.design_patterns.requirements.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    private String name;
    private SportType sportType;
    private List<Team> teams = new ArrayList<>();
    private List<Stage> stages = new ArrayList<>();

    public Championship(String name, SportType sportType) {
        this.name = name;
        this.sportType = sportType;
    }

    public boolean addTeam(Team t) {
        if (t.getSportType().equals(this.sportType)) {
            teams.add(t);
            t.addChampionship(this);
            return true;
        } else {
            System.out.println("Can not add team " + t.getName() + " to championship: " + this.name);
            return false;
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public List<Stage> getStages() {
        return stages;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void getResults() {
        for (Stage stage : this.getStages()) {
            System.out.println("Stage: " + stage.getNoStage());
            for (Match m : stage.getMatches()) {
                System.out.println(m.getHomeTeam() + " - " + m.getAwayTeam() + ": " + m.getScore());
            }
        }
    }

    public void getRanking() {
        System.out.println("Name\tPoints\tWins\tDraws\tLoses");
        for (Team team : teams) {
            System.out.println(team + "\t " + team.getNoOfPoints(this) + "\t" + team.getNoOfWins(this) + "\t" + team.getNoOfDraws(this) + "\t" + team.getNoOfLoses(this));
        }
    }

    public void generateStages() {
        for (int i = 0; i < this.teams.size(); i++) {
            this.stages.add(new Stage(i+1,this));
        }
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Championship{" +
                "name='" + name + '\'' +
                '}';
    }
}
