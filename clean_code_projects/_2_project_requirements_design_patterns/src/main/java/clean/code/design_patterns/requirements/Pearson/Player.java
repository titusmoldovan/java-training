package clean.code.design_patterns.requirements.Pearson;


import clean.code.design_patterns.requirements.SportType;
import clean.code.design_patterns.requirements.Team.Team;

public class Player extends Person {
    private SportType sportType;
    private Team currentTeam;
    private int attackingPoints;
    private int deffensePoints;

    private Player(Builder builder) {
        super(builder.firstName, builder.lastName,builder.age);
        this.sportType = builder.sportType;
        this.attackingPoints = builder.attackingPoints;
        this.deffensePoints = builder.defensePoints;


    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private int attackingPoints;
        private int defensePoints;
        private SportType sportType;

        public Builder(String firstName, String lastName, SportType sportType) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sportType = sportType;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setAttackingPoints(int attackingPoints) {
            this.attackingPoints = attackingPoints;
            return this;
        }

        public Builder setDefensePoints(int defensePoints) {
            this.defensePoints = defensePoints;
            return this;
        }


        public Player build() {
            return new Player(this);
        }
    }

    public SportType getSportType() {
        return this.sportType;
    }

    public Team getCurrentTeam() {
        return currentTeam;
    }

    public int getAttackingPoints() {
        return attackingPoints;
    }

    public int getDeffensePoints() {
        return deffensePoints;
    }

    public void setCurrentTeam(Team currentTeam) {
        this.currentTeam = currentTeam;
    }

    @Override
    public String toString() {
        return "Player{" +
                "sportType=" + sportType +
                ", currentTeam=" + currentTeam +
                ", attackingPoints=" + attackingPoints +
                ", deffensePoints=" + deffensePoints +
                '}';
    }

}
