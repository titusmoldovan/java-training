package code._4_student_effort.movie;


public class Database {
    Studio[] database;

    public Database() {
        database = populateDatabase();
    }

    private Studio[] populateDatabase() {
        Prize oscar1990 = new Prize("oscar", 1990);
        Prize oscar2000 = new Prize("oscar", 2000);
        Prize oscar2010 = new Prize("oscar", 2010);
        Prize oscar2018 = new Prize("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor with 2 oscars", 35, new Prize[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor with oscars from 2000", 55, new Prize[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor with oscars from 2018", 23, new Prize[]{oscar2018});
        Actor actorWithoutPizes01 = new Actor("actor without oscars 01", 33, new Prize[]{});
        Actor actorWithoutPizes02 = new Actor("actor without oscars 02", 60, new Prize[]{});
        Actor actorWithoutPizes03 = new Actor("actor without oscars 03", 20, new Prize[]{});

        Film film1 = new Film(1990, "films with actors with oscars", new Actor[]{actorOscar1990, actorWithoutPizes01});
        Film film2 = new Film(2010, "films with actors without oscars2", new Actor[]{actorWithoutPizes01, actorWithoutPizes02, actorWithoutPizes03});
        Film film3 = new Film(2010, "films with actors without oscars3", new Actor[]{actorWithoutPizes01, actorWithoutPizes02, actorWithoutPizes03});
        Film film4 = new Film(2018, "films with actors with oscars", new Actor[]{actorOscar2010, actorOscar2018, actorWithoutPizes02});
        Film film5 = new Film(2018, "films with actors without oscars5", new Actor[]{actorWithoutPizes02, actorWithoutPizes03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        return new Studio[]{studio1, studio2};
    }

    public String studiosNameWithMoreThan2FilmsRealeased() {
        StringBuilder studios = new StringBuilder();
        for (Studio studio : database)
            if (studio.getFilms().length > 2)
                studios.append(studio.getName()).append(" ");
        return studios.toString();
    }

    public String studiosNameHavingActorWithName(String name) {
        StringBuilder studios = new StringBuilder();
        boolean exists = false;
        for (Studio studio : database) {
            exists = false;
            for (Film film : studio.getFilms()) {
                for (Actor actor : film.getActors())
                    if (actor.getName().equals(name)) {
                        exists = true;
                        break;
                    }
                if (exists)
                    break;
            }
            if (exists)
                studios.append(studio.getName()).append(" ");
        }
        return studios.toString();
    }

    public String moviesNameHavingActorAboveAge(int age) {
        StringBuilder studios = new StringBuilder();
        boolean exists = false;
        for (Studio studio : database) {
            for (Film film : studio.getFilms()) {
                exists = false;
                for (Actor actor : film.getActors())
                    if (actor.getAge()>age) {
                        exists = true;
                        break;
                    }
                if(exists)
                    studios.append(film.getName()).append("; ");
            }
        }
        return studios.toString();
    }
}
