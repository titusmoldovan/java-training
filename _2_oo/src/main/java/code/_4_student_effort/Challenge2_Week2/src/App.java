import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {


    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2000});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990,"film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010,"film cu actori fara premii2", new Actor[]{actorFaraPremii01,
                                                                                actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010,"film cu actori fara premii3", new Actor[]{actorFaraPremii01,
                                                                        actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018,"film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2010,
                                                                                                actorFaraPremii02 });
        Film film5 = new Film(2018,"film cu actori fara premii5", new Actor[]{actorFaraPremii01,
                actorFaraPremii02});

        Studio studio1 = new Studio("MGM", new Film[]{film1,film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3,film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //gasire si printare studiouri care au mai mult de 2 filme
        ArrayList<String> numeStudiosPeste2Filme = new ArrayList<>();
        for (int i = 0; i< studioDatabase.length; i++ ){
            if(studioDatabase[i].getNrFilme() >2){
                numeStudiosPeste2Filme.add(studioDatabase[i].getNume());
            }
        }

        for (int i = 0; i<numeStudiosPeste2Filme.size(); i++){
            System.out.println("Studio care are peste 2 filme: "+numeStudiosPeste2Filme.get(i));
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //gasire studiouri in care joaca actorul cu numele "actor cu 2 oscaruri"

        ArrayList<String> numeStudiosActor = new ArrayList<>();
        for (int i = 0; i< studioDatabase.length; i++ ){
            if(studioDatabase[i].findActor("actor cu 2 oscaruri") == true){
                numeStudiosActor.add(studioDatabase[i].getNume());
            }
        }

        for (int i = 0; i<numeStudiosActor.size(); i++){
            System.out.println("Studio care are filme in care joaca actorul 'actor cu 2 oscaruri: " +numeStudiosActor.get(i));
        }


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //gasire filme in care au jucat actori cu varsta peste 50
        Film[] toateFilmele = new Film[]{film1,film2,film3,film4,film5};
        ArrayList<String> filmeActoriVarstaPeste = new ArrayList<>();

        for (int i = 0; i < toateFilmele.length; i++){
            if(toateFilmele[i].findActorVarstaPeste(50) == true){
                filmeActoriVarstaPeste.add(toateFilmele[i].getNume());
            }
        }

        for (int i = 0 ; i <filmeActoriVarstaPeste.size(); i++){
            System.out.println("Film in care joaca cel putin un actor cu varsta peste 50 ani:"+ filmeActoriVarstaPeste.get(i));
        }
    }
}
