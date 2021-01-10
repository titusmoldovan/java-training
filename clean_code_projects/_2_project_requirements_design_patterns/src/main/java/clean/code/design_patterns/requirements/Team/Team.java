package clean.code.design_patterns.requirements.Team;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.Pearson.Coach;
import clean.code.design_patterns.requirements.Pearson.Player;
import clean.code.design_patterns.requirements.SportType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Team {
    private String name;
    private SportType sportType;
    private List<Championship> championships = new ArrayList<>();

    private List<Player> players;
    private Coach coach;

    private Map<Championship, Integer> noOfWins = new HashMap<>();
    private Map<Championship, Integer> noOfDraws = new HashMap<>();
    private Map<Championship, Integer> noOfLoses = new HashMap<>();

    protected Map<Championship, Integer> noOfPoints = new HashMap<>();

    public List<Championship> getChampionships() {
        return championships;
    }

    public Team(String name, SportType sportType) {
        this.name = name;
        this.sportType = sportType;
        this.players = new ArrayList<>();
    }

    public SportType getSportType() {
        return this.sportType;
    }

    public abstract void addWinPoints(Championship ch);

    public abstract void addDrawPoints(Championship ch);

    public void addPlayer(Player p) {
        if (this.sportType.equals(p.getSportType())) {
            players.add(p);
            p.setCurrentTeam(this);
            //   System.out.println("Succesfully added player " + p.getFirstName() + " " + p.getLastName() + " to the team " + this.name);
        } else {
            System.out.println("Can't add this player to the team " + this.name);
        }
    }

    public void setCoach(Coach coach) {
        if (this.sportType.equals(coach.getSportType())) {
            this.coach = coach;
            coach.setTeam(this);
        } else {
            System.out.println("Can not add coach " + coach.getLastName() + " to the team " + name);
        }
    }

    public int getNoOfPoints(Championship ch) {
        return this.noOfPoints.get(ch);
    }

    public int getNoOfWins(Championship ch) {
        return this.noOfWins.get(ch);
    }

    public int getNoOfDraws(Championship ch) {
        return this.noOfDraws.get(ch);
    }

    public int getNoOfLoses(Championship ch) {
        return this.noOfLoses.get(ch);
    }

    public void addWins(Championship championship) {
        this.noOfWins.put(championship, this.noOfWins.get(championship) + 1);
    }

    public void addDraws(Championship championship) {
        this.noOfDraws.put(championship, this.noOfDraws.get(championship) + 1);
    }

    public void addLoses(Championship championship) {
        this.noOfLoses.put(championship, this.noOfLoses.get(championship) + 1);
    }

    public String getName() {
        return name;
    }

    public Coach getCoach() {
        return coach;
    }


    public void addChampionship(Championship ch) {
        if (ch.getSportType().equals(this.sportType)) {
            championships.add(ch);
            initialize(ch);
        }
    }

    //Helper function
    private void initialize(Championship ch) {
        noOfWins.put(ch, 0);
        noOfLoses.put(ch, 0);
        noOfDraws.put(ch, 0);
        noOfPoints.put(ch, 0);
    }

    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return name;
    }
}
