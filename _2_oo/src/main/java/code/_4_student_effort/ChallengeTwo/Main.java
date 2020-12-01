package code._4_student_effort.ChallengeTwo;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /*For exercise 1 */
    private static final int noOfMovies = 2;
    /*For exercise 2*/
    private static final String actorName = "Actor cu 2 oscaruri";
    /*For exercise 3*/
    private static final int numActors = 1;
    private static final int actorAge = 50;

    private static Studio[] studioDatabase;

    public static void main(String[] args) {


        System.out.println("Studio names with more than " + noOfMovies + " movies:");
        String[] studioNames = getStudiosNamesWithMoreThanXMovies(studioDatabase, noOfMovies);
        for (String name : studioNames) {
            System.out.println(name);
        }

        System.out.println("Studio names in which plays actor with name: " + actorName);
        studioNames = getStudioNamesInWhichPlaysActorWithName(studioDatabase, actorName);
        for (String nume : studioNames) {
            System.out.println(nume);
        }

        System.out.println("Movie names in which plays at least " + numActors + " actor with age above " + actorAge + ":");
        String[] movieNames = getMovieNamesInWhichPlaysAtLeastXActorsWithAgeAboveY(studioDatabase, numActors, actorAge);
        if (movieNames.length > 0) {
            for (String name : movieNames) {
                System.out.println(name);
            }
        } else {
            System.out.println("Nu exista!");
        }
    }

    public static String[] getStudiosNamesWithMoreThanXMovies(Studio[] studioDatabase, int noMovies) {
        String[] studioNames = new String[]{};
        if (studioDatabase == null)
            return studioNames;
        for (Studio studio : studioDatabase) {
            if (studio.getFilme().length > noMovies) {
                studioNames = addElement(studioNames.length, studioNames, studio.getNume());
            }
        }
        return studioNames;
    }

    public static String[] getStudioNamesInWhichPlaysActorWithName(Studio[] studioDatabase, String actorName) {
        String[] studioNames = new String[]{};

        if (studioDatabase == null)
            return studioNames;
        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume() != null && actor.getNume().equals(actorName)) {
                        studioNames = addElement(studioNames.length, studioNames, studio.getNume());
                    }
                }
            }
        }
        return studioNames;
    }

    public static String[] getMovieNamesInWhichPlaysAtLeastXActorsWithAgeAboveY(Studio[] studioDatabase, int numActors, int age) {

        String[] ansMovieNames = new String[]{};
        if (studioDatabase == null)
            return ansMovieNames;

        Map<Film, String[]> map = new HashMap<>();
        String[] tempActorNames = new String[]{};


        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > age) {
                        tempActorNames = addElement(tempActorNames.length, tempActorNames, actor.getNume());
                        map.put(film, tempActorNames);
                    }
                }
                tempActorNames = new String[]{};
            }
        }
        for (Map.Entry<Film, String[]> entry : map.entrySet()) {
            if (entry.getValue().length >= numActors) {
                ansMovieNames = addElement(ansMovieNames.length, ansMovieNames, entry.getKey().getNume());
            }
        }
        return ansMovieNames;
    }

    /* Helper functions */

    private static String[] addElement(int n, String[] myArray, String element) {
        int i;
        String[] newArray = new String[n + 1];
        for (i = 0; i < n; i++) {
            newArray[i] = myArray[i];
        }
        newArray[n] = element;
        return newArray;

    }

    /*Static initialization */
    static {
        Premiu oscar1990 = new Premiu("Oscar", 1990);
        Premiu oscar2000 = new Premiu("Oscar", 2000);
        Premiu oscar2010 = new Premiu("Oscar", 2010);
        Premiu oscar2018 = new Premiu("Oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("Actor fara premii 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("Actor fara premii 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("Actor fara premii 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar 1990", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii 2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii 3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar 2018", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii 5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        studioDatabase = new Studio[]{studio1, studio2};
    }
}
