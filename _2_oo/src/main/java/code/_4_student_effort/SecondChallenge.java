package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Prize {
    private String name;
    private Integer year;

    public Prize(String name, Integer year) {
        this.name = name;
        this.year = year;
    }


}

class Actor {
    private String name;
    private Integer age;
    private Prize[] prizes;

    public Actor(String name, Integer age, Prize[] prizes) {
        this.name = name;
        this.age = age;
        this.prizes = prizes;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Prize[] getPrizes() {
        return prizes;
    }
}

class Movie {
    private Integer yearOfAppearance;
    private String name;
    private Actor[] actors;

    public Integer getYearOfAppearance() {
        return yearOfAppearance;
    }

    public String getName() {
        return name;
    }

    public Actor[] getActors() {
        return actors;
    }

    public Movie(Integer yearOfAppearance, String name, Actor[] actors) {
        this.yearOfAppearance = yearOfAppearance;
        this.name = name;
        this.actors = actors;
    }
}

class Studio {
    private String name;
    private Movie[] movies;

    public Studio(String name, Movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
}


public class SecondChallenge {
    private static Studio[] studios;
    private static Movie[] movies;

    //stage 3 - ex1
    public static List<String> getStudiosWithMoreThan(int minimumNumberOfMovies) {
        List<String> studioNamesWithNumberOfMoviesMoreThan = new ArrayList<>();
        for (Studio studio : studios) {
            if (studio.getMovies().length > minimumNumberOfMovies) {
                studioNamesWithNumberOfMoviesMoreThan.add(studio.getName());
            }
        }
        return studioNamesWithNumberOfMoviesMoreThan;
    }

    //stage 3 - ex2
    public static List<String> getStudiosWithActor(String actorName) {
        List<String> studioNamesWithActor = new ArrayList<>();
        for (Studio studio : studios) {
            boolean studioIsAlreadyInList = false;
            for (Movie movie : studio.getMovies()) {
                if (studioIsAlreadyInList) {
                    break;
                }
                for (Actor actor : movie.getActors()) {
                    if (actor.getName().equalsIgnoreCase(actorName)) {
                        studioNamesWithActor.add(studio.getName());
                        studioIsAlreadyInList = true;
                        break;
                    }
                }
            }
        }
        return studioNamesWithActor;
    }

    //stage 3 - ex 3
    public static List<String> getMovieNameWithActorsHavingAgeAbove(int age) {
        List<String> movieNamesWithActorsHavingAgeAbove = new ArrayList<>();

        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getAge() > age) {
                    movieNamesWithActorsHavingAgeAbove.add(movie.getName());
                    break;
                }
            }
        }
        return movieNamesWithActorsHavingAgeAbove;
    }

    public static void main(String[] args) {
        Prize oscar2018 = new Prize("Oscar", 2018);
        Prize goldenGlobe2018 = new Prize("Golden Globe", 2018);
        Prize oscar2019 = new Prize("Oscar", 2019);
        Prize goldenGlobe2019 = new Prize("Golden Globe", 2019);
        Prize oscar2020 = new Prize("Oscar", 2020);
        Prize goldenGlobe2020 = new Prize("Golden Globe", 2020);

        //actor cu 2 oscaruri
        Actor kateWinslet = new Actor("Kate Winslet", 50, new Prize[]{oscar2018, oscar2019});

        Actor leoDicaprio = new Actor("Leonardo DiCaprio", 49, new Prize[]{goldenGlobe2020});
        Actor johnnyDepp = new Actor("Johnny Depp", 55, new Prize[]{goldenGlobe2018, oscar2020});
        Actor michellePfeiffer = new Actor("Michelle Pfeiffer", 45, new Prize[]{goldenGlobe2018});
        Actor scarlettJohansson = new Actor("Scarlett Johansson", 35, new Prize[]{oscar2020});
        Actor jasonStatham = new Actor("Jason Statham", 52, new Prize[]{oscar2020, oscar2019, goldenGlobe2019, goldenGlobe2018});
        Actor vinDiesel = new Actor("Vin Diesel", 40, new Prize[]{});

        Movie divergent = new Movie(2014, "Divergent", new Actor[]{kateWinslet});
        Movie titanic = new Movie(1997, "Titanic", new Actor[]{kateWinslet, leoDicaprio});
        Movie murderOrientExpress = new Movie(2017, "Murder on the Orient Express", new Actor[]{johnnyDepp, michellePfeiffer});
        Movie piratesOfCaribbean = new Movie(2007, "Pirates of the Caribbean", new Actor[]{johnnyDepp});
        Movie fastAndFurious = new Movie(2019, "The fast and the furious", new Actor[]{jasonStatham, vinDiesel});
        Movie lucy = new Movie(2014, "Lucy", new Actor[]{scarlettJohansson});

        Studio warnerBros = new Studio("Warner Bros", new Movie[]{divergent, lucy, piratesOfCaribbean});
        Studio universalPictures = new Studio("Universal Pictures", new Movie[]{fastAndFurious, murderOrientExpress, titanic});
        Studio columbiaPictures = new Studio("Columbia Pictures", new Movie[]{});

        studios = new Studio[]{warnerBros, universalPictures, columbiaPictures};
        movies = new Movie[]{divergent, titanic, murderOrientExpress, piratesOfCaribbean, fastAndFurious, lucy};

        System.out.println(SecondChallenge.getStudiosWithMoreThan(2));
        System.out.println(SecondChallenge.getStudiosWithActor("Kate Winslet"));
        System.out.println(SecondChallenge.getMovieNameWithActorsHavingAgeAbove(50));
    }


}
