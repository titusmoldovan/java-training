package code._4_student_effort.challenge2_MovieDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMovieDatabase {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.println("----Numele studiourilor care au publicat cel putin 2 filme----");
        List<Studio> studioWithMoreThan2Movies = Arrays.stream(studioDatabase).filter(studio -> studio.getFilme().length >= 2).collect(Collectors.toList());
        studioWithMoreThan2Movies.forEach(studio -> System.out.println(studio.getNume()));

        boolean actorFound = false;
        System.out.println("----Numele studiourilor care contin actorul cu numele 'actor cu 2 oscaruri'----");
        for(Studio s : studioDatabase){
            for(Film f : s.getFilme()){
                for(Actor a : f.getActori()){
                    if(a.getNume().equals("actor cu 2 oscaruri")){
                        System.out.println(s.getNume());
                        actorFound = true;
                        break;
                    }
                }
                if(actorFound){
                    break;
                }
            }
        }
        System.out.println("----Numele filmelor in care joaca actori care au cel putin 50 de ani----");
        for (Studio s : studioDatabase) {
            for (Film f : s.getFilme()) {
                for (Actor a : f.getActori()) {
                    if (a.getVarsta() > 50) {
                        System.out.println(f.getNume());
                        break;
                    }
                }
            }
        }
    }
}
