package _4_student_effort;

public class TestMovieDataBase {

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor oscar ", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("Actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("Actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("Actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990,actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar2", new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii02});
        Film film5 = new Film(1990, "film cu actori fara premii5", new Actor[]{actorFaraPremii02,actorFaraPremii03});

        Studio studio1 = new Studio("MGM",new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney",new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};
        int j = 0;
        System.out.println();
        System.out.println("Studios that have published more than 2 movies are : ");
            for (int i = 0; i < studioDatabase.length ; i++)
            {
                if(studioDatabase[i].getMovies().length > 2)
                {   j++;
                    System.out.println("\t" + j +"."  +studioDatabase[i].getName() );
                }
            }
        System.out.println();
        System.out.println("Studios in witch plays the actor with " + "actor cu 2 oscaruri : ");

            int contor = 0 ;
            for(int i = 0 ; i < studioDatabase.length; i++)
            {
                boolean ok = false;
                    for(int x = 0 ; x < studioDatabase[i].getMovies().length; x++ )
                        for(int k = 0 ;  k < studioDatabase[i].getMovies()[x].getActori().length; k++)
                            if(studioDatabase[i].getMovies()[x].getActori()[k].getName().equalsIgnoreCase("actor cu 2 oscaruri"))
                                ok = true;

                    if(ok == true)
                    {   contor++;
                        System.out.println("\t" + contor + "." + studioDatabase[i].getName());
                    }

            }
        System.out.println();
        System.out.println("Movies in witch plays at least an actor with above 50 : ");
           int contor2 = 0;
            for(int i = 0 ; i< studioDatabase.length ; i++)
            {

                for (int k = 0; k< studioDatabase[i].getMovies().length; k++)
                {
                    boolean ok = false;
                    for(int l = 0; l < studioDatabase[i].getMovies()[k].getActori().length; l++)
                        if(studioDatabase[i].getMovies()[k].getActori()[l].getAge()  >= 50)
                            ok = true;

                    if(ok == true)
                    {   contor2++;

                        System.out.println(contor2 + "." + studioDatabase[i].getMovies()[k].getMovieName());
                    }
                }
            }
    }

}
