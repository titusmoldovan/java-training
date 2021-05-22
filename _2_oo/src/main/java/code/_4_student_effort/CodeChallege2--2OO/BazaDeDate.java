public class BazaDeDate {
    public static Studio[] dataBase() {
        //Premii
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);
        Premiu oscar2020 = new Premiu("oscar", 2020);

        //Actori
        Actor robertDowneyJr = new Actor("Robert Downey Jr.", 52, new Premiu[]{oscar1990, oscar2000, oscar2020});
        Actor tomHolland = new Actor("Tom Holland", 20, new Premiu[]{oscar2018});
        Actor hughJackman = new Actor("Hugh Jackman", 51, new Premiu[]{oscar2010});
        Actor sebastianStan = new Actor("Sebastian Stan", 30, new Premiu[]{});
        Actor chrisHemsworth = new Actor("Chris Hemsworth", 35, new Premiu[]{});
        Actor ionutRaducanu = new Actor("Ionut Raducanu", 32, new Premiu[]{});
        Actor chrisEvans = new Actor("Chris Evans", 35, new Premiu[]{});

        //Filme
        Film theAvengers = new Film("The Avengers", 2010, new Actor[]{robertDowneyJr, chrisHemsworth,});
        Film xMen = new Film("XMen", 2009, new Actor[]{hughJackman, tomHolland, robertDowneyJr});
        Film thor = new Film("Thor", 2018, new Actor[]{sebastianStan, chrisHemsworth});
        Film captainAmerica = new Film("Captain America", 2011, new Actor[]{chrisEvans, tomHolland});
        Film parfumDeMahala = new Film("Parfum de Mahala", 1990, new Actor[]{ionutRaducanu, sebastianStan});
        Film killaHouseKlan = new Film("Killa House Klan", 2019, new Actor[]{ionutRaducanu});

        //Studiouri
        Studio disney = new Studio("Disney", new Film[]{theAvengers, thor, captainAmerica});
        Studio centuryFox = new Studio("20th Century Fox", new Film[]{xMen});
        Studio seekMovies = new Studio("Seek Movies", new Film[]{parfumDeMahala, killaHouseKlan});
        Studio[] studioDatabase = new Studio[]{disney, centuryFox, seekMovies};

        return studioDatabase;
    }

    public static String studiouriCuMaiMultDeDouaFilme() {
        String numeStudio = "";
        for (Studio studio : dataBase()) {
            if (studio.filme.length > 2)
                numeStudio = numeStudio + studio.nume + ", ";
        }
        return numeStudio;
    }

    public static String studiouriInCareAuJucatActoriCuMaiMultDeDouaOscaruri() {
        String numeStudio = "";
        for (Studio studio : dataBase())
            for (Film film : studio.filme)
                for (Actor actor : film.actorii) {
                    if (actor.premii.length > 2)
                        numeStudio = numeStudio + studio.nume + ", ";

                }
        return numeStudio;
    }

    public static String filmeInCareAuJucatActoriCareAuCelPutin50DeAni() {
        String numeFilm = "";
        for (Studio studio : dataBase())
            for (Film film : studio.filme)
                for (Actor actor : film.actorii) {
                    if (actor.varsta > 50)
                        if (numeFilm.contains(film.nume)) ;
                        else numeFilm = numeFilm + film.nume + ", ";
                }
        return numeFilm;
    }
}
