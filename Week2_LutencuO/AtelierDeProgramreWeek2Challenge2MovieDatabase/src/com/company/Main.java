package com.company;
/*
* Author: Lutencu Octavian
* Task: MovieDatabase
* */

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu 2 oscaruri din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu  oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("Actor cu fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("Actor cu fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("Actor cu fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1900, "film cu actori de oscar",
                new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2",
                new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3",
                new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar",
                new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5",
                new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDataBase = new Studio[]{studio1, studio2};

        //first query
        System.out.println("Get all studio names that have published more than 2 movies: ");
        Arrays.stream(studioDataBase)
                .filter(x -> x.getFilme().length > 2)
                .collect(Collectors.toList())
                .forEach(x -> {
                    System.out.println(x.getNume());
                });


        // second+third query
        Map<String, List<String>> actorNameStudio = new HashMap<>();
        Set<String> movieWithOldActors = new HashSet<>();

        for (Studio studio : studioDataBase) {
            String studioName = studio.getNume();
            Film[] movies = studio.getFilme();

            for (Film film : movies) {
                String movieName = film.getNume();
                Actor[] actors = film.getActori();

                for (Actor actor : actors) {
                    actorNameStudio.put(actor.getNume(), new ArrayList<String>());
                    actorNameStudio.get(actor.getNume()).add(studioName);
                    if (actor.getVarsta() > 50) {
                        movieWithOldActors.add(movieName);
                    }
                }
            }
        }

        System.out.println("Get studio in witch plays the actor with name: Actor cu 2 oscaruri");
        actorNameStudio.get("Actor cu 2 oscaruri")
                .forEach(System.out::println);

        System.out.println("Movie in witch play old Actors: ");
        movieWithOldActors.forEach(System.out::println);


    }
}
