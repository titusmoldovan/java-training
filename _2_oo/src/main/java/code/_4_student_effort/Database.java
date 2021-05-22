package code._4_student_effort;

import java.util.ArrayList;

public class Database {
    static ArrayList<String> whoPublishedMoreThanTwoMovies(ArrayList<Studio> studios) {
        ArrayList<String> studioNames = new ArrayList<>();
        for (Studio s : studios) {
            if (s.getFilms().size() >= 2) {
                studioNames.add(s.getName());
            }
        }
        return studioNames;
    }

    static ArrayList<String> whereHePlays(ArrayList<Studio> studios, String actorName) {
        ArrayList<String> movieNames = new ArrayList<>();
        for (Studio s : studios) {
            for (Film f : s.getFilms()) {
                for (Actor a : f.getActors()) {
                    if (a.getName().equals(actorName)) {
                        movieNames.add(f.getName());
                    }
                }
            }
        }
        return movieNames;
    }

    static ArrayList<String> moviesWithOldActors(ArrayList<Studio> studios, int ageLimit) {
        ArrayList<String> movieNames = new ArrayList<>();
        for (Studio s : studios) {
            for (Film f : s.getFilms()) {
                for (Actor a : f.getActors()) {
                    if (a.getAge() >= ageLimit) {
                        movieNames.add(f.getName());
                    }
                }
            }
        }
        return movieNames;
    }

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu grammy2015 = new Premiu("grammy", 2015);
        Premiu oscar2019 = new Premiu("oscar", 2019);
        Premiu globulDeAur1986 = new Premiu("Globul de Aur", 1986);

        Actor actor1 = new Actor("Ana", 20, null);
        Actor actor2 = new Actor("Marcela", 65, null);
        Actor actor3 = new Actor("Viktor", 35, null);
        Actor actor4 = new Actor("Sergiu", 47, null);

        Film film1 = new Film(2015, "Film misto", null);
        film1.addActors(actor1);
        film1.addActors(actor4);
        Film film2 = new Film(1970, "Film prost", null);
        film2.addActors(actor2);
        film2.addActors(actor3);
        Film film3 = new Film(1985, "Film necunoscut", null);
        film3.addActors(actor1);
        film3.addActors(actor3);

        Studio studio1 = new Studio("nume palpitant", null);
        studio1.addFilm(film2);
        Studio studio2 = new Studio("necunoscut", null);
        studio2.addFilm(film1);
        studio2.addFilm(film3);

        actor1.addPremiu(grammy2015);
        actor4.addPremiu(oscar1990);
        actor2.addPremiu(oscar2019);
        actor3.addPremiu(globulDeAur1986);
        actor2.addPremiu(grammy2015);
        actor3.addPremiu(oscar1990);

        ArrayList<Studio> studioDatabase = new ArrayList<>();
        studioDatabase.add(studio1);
        studioDatabase.add(studio2);

        ArrayList<String> studiosWhoPublishedMoreThan2 = Database.whoPublishedMoreThanTwoMovies(studioDatabase);
        for (String s : studiosWhoPublishedMoreThan2) {
            System.out.println(s);
        }

        ArrayList<String> whereHePlayed = Database.whereHePlays(studioDatabase, "Ana");
        for (String s : whereHePlayed) {
            System.out.println(s);
        }

        ArrayList<String> olderActors = Database.moviesWithOldActors(studioDatabase, 60);
        for (String s : olderActors) {
            System.out.println(s);
        }
    }
}
