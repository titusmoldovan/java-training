package code._4_student_effort.challenge_2;

public class Database {

    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actor1 = new Actor("Brad Pitt", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actor2 = new Actor("Vin Diesel", 55, new Premiu[]{oscar2010});
        Actor actor3 = new Actor("Paul Walker", 38, new Premiu[]{oscar2018});
        Actor actor4 = new Actor("Leonardo Di Caprio", 33, new Premiu[]{});
        Actor actor5 = new Actor("Angellina Jolie", 60, new Premiu[]{});
        Actor actor6 = new Actor("Vanessa Hudgens", 20, new Premiu[]{});

        Film film1 = new Film("7 ani in Tibet", 1990, new Actor[]{actor1, actor2});
        Film film2 = new Film("Domnul si Doamna Smith", 2009, new Actor[]{actor1, actor5, actor3});
        Film film3 = new Film("Titanic", 1997, new Actor[]{actor4, actor6, actor1});
        Film film4 = new Film("Fast and Furious", 2000, new Actor[]{actor2, actor3, actor5});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film1});

        Film[] films = new Film[]{film1, film2, film3, film4};
        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.print("Toate studiourile care au produs mai mult de doua filme: ");
        for (Studio studio : studioDatabase) {
            if (studio.hasPublishedMoreThanTwoMovies())
                System.out.print(studio.getNume()+" ");
        }

        System.out.println();

        System.out.print("Toate studiourile care au produs filme ce il au actor pe Brad Pitt: ");
        for (Studio studio : studioDatabase) {
            if (studio.isActorPlaying("Brad Pitt"))
                System.out.print(studio.getNume()+" ");
        }

        System.out.println();

        System.out.print("Toate filmele in in care joaca cel putin un actor cu varsta de peste 50 ani: ");
        for (Film film : films) {
            if (film.isPlayingAtLeastAnActorWithAgeAboveGivenNumber(50))
                System.out.print(film.getNume()+" ");
        }

        System.out.println();


    }
}
