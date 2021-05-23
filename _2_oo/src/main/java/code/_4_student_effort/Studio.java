package com.company;

import java.util.ArrayList;

public class Studio {
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    static public ArrayList<String> getStudioswithmorethan2Movies(Studio[] studioDatabase) {
        ArrayList<String> arr = new ArrayList<String>();

        for (Studio studio : studioDatabase) {
            if (studio.filme.length > 2)
                arr.add(studio.nume);
        }

        return arr;
    }

    static public ArrayList<String> getStudioswithSpecificActor(Studio[] studioDatabase, String actorName) {
        ArrayList<String> arr = new ArrayList<String>();

        for (Studio studio : studioDatabase) {
            LOOP:
            for (Film movie : studio.filme) {
                for (Actor actor : movie.actori)
                    if (actor.nume.equals(actorName) == true) {
                        arr.add(studio.nume);
                        break LOOP;
                    }
            }
        }

        return arr;
    }

    static public ArrayList<String> getMoviesNameswithPlus50Actor(Studio[] studioDatabase) {
        ArrayList<String> arr = new ArrayList<String>();

        for (Studio studio : studioDatabase) {
            for (Film movie : studio.filme) {
                for (Actor actor : movie.actori)
                    if (actor.varsta > 50) {
                        arr.add(movie.nume);
                        break;
                    }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii02});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii02});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        ArrayList<String> studioswithmorethan2Movies = getStudioswithmorethan2Movies(studioDatabase);
        System.out.println("Studiouri cu mai mult de doua filme: " + studioswithmorethan2Movies);

        ArrayList<String> studioswithSpecificActor = getStudioswithSpecificActor(studioDatabase, "actor cu 2 oscaruri");
        System.out.println("Studiouri cu actorul dat: " + studioswithSpecificActor);

        ArrayList<String> movieswith50PlusActor = getMoviesNameswithPlus50Actor(studioDatabase);
        System.out.println("Filme cu actori 50+: " + movieswith50PlusActor);
    }
}
