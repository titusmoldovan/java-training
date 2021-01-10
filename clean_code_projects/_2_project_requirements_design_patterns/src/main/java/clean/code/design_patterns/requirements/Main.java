package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.Championship.Championship;
import clean.code.design_patterns.requirements.Championship.Match;
import clean.code.design_patterns.requirements.Championship.Stage;
import clean.code.design_patterns.requirements.Factories.ChampionshipFactotories.BasketballChampionshipFactory;
import clean.code.design_patterns.requirements.Factories.ChampionshipFactotories.ChampionshipFactory;
import clean.code.design_patterns.requirements.Factories.ChampionshipFactotories.FootballChampionshipFactory;
import clean.code.design_patterns.requirements.Factories.ChampionshipFactotories.HandballChampionshipFactory;
import clean.code.design_patterns.requirements.Factories.TeamFactories.BasketballTeamFactory;
import clean.code.design_patterns.requirements.Factories.TeamFactories.FootballTeamFactory;
import clean.code.design_patterns.requirements.Factories.TeamFactories.HandballTeamFactory;
import clean.code.design_patterns.requirements.Factories.TeamFactories.TeamFactory;
import clean.code.design_patterns.requirements.Pearson.Coach;
import clean.code.design_patterns.requirements.Pearson.Player;
import clean.code.design_patterns.requirements.Team.Team;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final String footballTeams = "clean_code_projects/_2_project_requirements_design_patterns/src/main/java/clean/code/design_patterns/requirements/FootballTeamsDistribution";
    private static final String handballTeams = "clean_code_projects/_2_project_requirements_design_patterns/src/main/java/clean/code/design_patterns/requirements/HandballTeamsDistribution";
    private static final String basketballTeams = "clean_code_projects/_2_project_requirements_design_patterns/src/main/java/clean/code/design_patterns/requirements/BasketballTeamsDistribution";

    public static void main(String[] args) {
        //TODO implement your design patterns in this package

        // firstTestMethod();

        List<Championship> footballChampionships = createChampionships(footballTeams);
        List<Championship> handballChampionships = createChampionships(handballTeams);
        List<Championship> basketballChampionships = createChampionships(basketballTeams);

        for (Championship ch : footballChampionships) {
            ch.generateStages();
        }
        for (Championship ch : footballChampionships) {
            System.out.println(ch.getStages());
        }
//        System.out.println(footballChampionships);
//        System.out.println(handballChampionships);
//        System.out.println(basketballChampionships);

    }

    private static List<Championship> createChampionships(String fileName) {
        List<Championship> championships = new ArrayList<>();
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            String championshipName;
            String teamName;
            while (s.hasNext()) {
                championshipName = s.nextLine();
                if (championshipName.contains(" :")) {
                    championshipName = championshipName.replace(" :", "");
                    if (fileName.contains("Football")) {
                        assignTeams(championships, s, championshipName, SportType.FOOTBALL);
                    }
                    if (fileName.contains("Handball")) {
                        assignTeams(championships, s, championshipName, SportType.HANDBALL);
                    }
                    if (fileName.contains("Basketball")) {
                        assignTeams(championships, s, championshipName, SportType.BASKETBALL);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (s != null) s.close();
        }
        return championships;
    }

    private static void assignTeams(List<Championship> championships, Scanner s, String championshipName, SportType sportType) {
        Championship championship = null;
        switch (sportType) {
            case FOOTBALL:
                championship = ChampionshipFactory.getChampionship(new FootballChampionshipFactory(), championshipName);
                asignTeams2(s, championship, SportType.FOOTBALL);
                break;
            case HANDBALL:
                championship = ChampionshipFactory.getChampionship(new HandballChampionshipFactory(), championshipName);
                asignTeams2(s, championship, SportType.HANDBALL);
                break;
            case BASKETBALL:
                championship = ChampionshipFactory.getChampionship(new BasketballChampionshipFactory(), championshipName);
                asignTeams2(s, championship, SportType.BASKETBALL);
                break;
        }
        championships.add(championship);
    }

    private static void asignTeams2(Scanner s, Championship championship, SportType sportType) {
        String teamName;
        Team team;
        while (s.hasNext()) {
            teamName = s.nextLine();
            if (teamName.isEmpty()) {
                break;
            }
            teamName = teamName.replace("  ", "");
            switch (sportType) {
                case FOOTBALL:
                    team = TeamFactory.getTeam(new FootballTeamFactory(), teamName);
                    break;
                case HANDBALL:
                    team = TeamFactory.getTeam(new HandballTeamFactory(), teamName);
                    break;
                case BASKETBALL:
                    team = TeamFactory.getTeam(new BasketballTeamFactory(), teamName);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + sportType);
            }
            championship.addTeam(team);
        }
    }

    private static void firstTestMethod() {
        //Build players
        Player player = new Player.Builder("Cristiano", "Ronaldo", SportType.FOOTBALL)
                .setAge(35)
                .setAttackingPoints(100)
                .setDefensePoints(50)
                .build();

        Player player2 = new Player.Builder("Cristina", "Neagu", SportType.HANDBALL)
                .setAge(31)
                .setAttackingPoints(98)
                .build();

        Player player3 = new Player.Builder("Lebron", "James", SportType.BASKETBALL)
                .build();


        //Use Team factories to get teams
        Team juventus = TeamFactory.getTeam(new FootballTeamFactory(), "Juventus");
        Team barcelona = TeamFactory.getTeam(new FootballTeamFactory(), "Barcelona");
        Team inter = TeamFactory.getTeam(new FootballTeamFactory(), "Inter Milano");
        Team la = TeamFactory.getTeam(new BasketballTeamFactory(), "LA Lakers");
        Team nyk = TeamFactory.getTeam(new BasketballTeamFactory(), "New York Kicks");
        Team csmBuc = TeamFactory.getTeam(new HandballTeamFactory(), "CSM Bucuresti");
        Team oltchim = TeamFactory.getTeam(new HandballTeamFactory(), "Oltchim");

        juventus.addPlayer(player);
        juventus.setCoach(new Coach("Andrea", "Pirlo", 40, SportType.FOOTBALL));
        csmBuc.addPlayer(player2);
        la.addPlayer(player3);

        // Championship factories

        Championship champLeague = ChampionshipFactory.getChampionship(new FootballChampionshipFactory(), "Champions League");
        Championship serieA = ChampionshipFactory.getChampionship(new FootballChampionshipFactory(), "Seria A ");
        Championship nba = ChampionshipFactory.getChampionship(new BasketballChampionshipFactory(), "NBA");
        Championship diviziaA = ChampionshipFactory.getChampionship(new HandballChampionshipFactory(), "Divizia A");


        champLeague.addTeam(juventus);
        champLeague.addTeam(barcelona);
        champLeague.addTeam(TeamFactory.getTeam(new FootballTeamFactory(), "Liverpool"));
        serieA.addTeam(juventus);

        nba.addTeam(la);
        nba.addTeam(nyk);

        Match match1NBA1 = new Match(new Stage(1, nba), la, nyk, new Match.Score(99, 73));
        Match match2NBA2 = new Match(new Stage(2, nba), nyk, la, new Match.Score(80, 100));


        Match matchCL1 = new Match(new Stage(1, champLeague), juventus, barcelona, new Match.Score(2, 1));
        Match matchCL2 = new Match(new Stage(2, champLeague), barcelona, juventus, new Match.Score(0, 0));

        //nba.getResults();

        champLeague.getRanking();

        System.out.println(juventus.getChampionships());
        System.out.println(barcelona.getChampionships());
    }


}
