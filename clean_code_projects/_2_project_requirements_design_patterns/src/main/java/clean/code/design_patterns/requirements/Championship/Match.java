package clean.code.design_patterns.requirements.Championship;

import clean.code.design_patterns.requirements.Team.Team;

public class Match {
    private Stage stage;
    private Team homeTeam;
    private Team awayTeam;
    private Score score;

    public Match(Stage stage, Team homeTeam, Team awayTeam, Score score) {
        if (homeTeam.getSportType().equals(awayTeam.getSportType())) {
            if ((stage.getChampionship().getSportType().equals(homeTeam.getSportType())
                    && stage.getChampionship().getSportType().equals(awayTeam.getSportType()))) {
                this.homeTeam = homeTeam;
                this.awayTeam = awayTeam;
                this.stage = stage;
                stage.addMatches(this);
                setScore(score);
            } else {
                System.out.println("Competition stage not ok");
            }
        } else {
            System.out.println("Different sports between teams or competition");
            return;
        }
    }

   public static class Score {
        private Integer homeTeamPoints;
        private Integer awayTeamPoints;

        public Score(Integer homeTeamPoints, Integer awayTeamPoints) {
            this.homeTeamPoints = homeTeamPoints;
            this.awayTeamPoints = awayTeamPoints;
        }

        public Integer getHomeTeamPoints() {
            return homeTeamPoints;
        }

        public Integer getAwayTeamPoints() {
            return awayTeamPoints;
        }

        @Override
        public String toString() {
            return homeTeamPoints + " - " + awayTeamPoints;
        }
    }

    public void setScore(Score score) {
        this.score = score;
        if (score.getHomeTeamPoints() > score.getAwayTeamPoints()) {
            this.homeTeam.addWins(this.stage.getChampionship());
            this.homeTeam.addWinPoints(this.stage.getChampionship());
            this.awayTeam.addLoses(this.stage.getChampionship());
        }
        if (score.getHomeTeamPoints() < score.getAwayTeamPoints()) {
            this.awayTeam.addWins(this.stage.getChampionship());
            this.awayTeam.addWinPoints(this.stage.getChampionship());
            this.homeTeam.addLoses(this.stage.getChampionship());
        }
        if (score.getHomeTeamPoints() == score.getAwayTeamPoints()) {
            this.awayTeam.addDraws(this.stage.getChampionship());
            this.homeTeam.addDrawPoints(this.stage.getChampionship());
            this.homeTeam.addDraws(this.stage.getChampionship());
            this.awayTeam.addDrawPoints(this.stage.getChampionship());
        }
    }

    public Score getScore() {
        return score;
    }

    public Stage getStage() {
        return stage;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }
}
