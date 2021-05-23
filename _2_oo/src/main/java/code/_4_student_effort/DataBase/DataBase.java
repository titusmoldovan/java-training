package code._4_student_effort.DataBase;

import javax.management.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class DataBase {
    public static List<String> Query1( Studio [] studioDatabase ) {
        List<String> out = new ArrayList<>();
        for (int i = 0; i < studioDatabase.length; i++) {
            if( studioDatabase[i].totalMovies() >= 2 )
                out.add(studioDatabase[i].getNume());
        }
        return  out;
    }

    public static List<String> Query2( Studio [] studioDatabase ) {
        List<String> out = new ArrayList<>();
        for (int i = 0; i < studioDatabase.length; i++) {
            for (int j = 0; j < studioDatabase[i].totalMovies(); j++)
                for( int k = 0; k < studioDatabase[i].getFilme().get(j).getActori().size(); k++ )
                    if (Objects.equals(studioDatabase[i].getFilme().get(j).getActori().get(k).getNume(), "actor cu 2 oscaruri"))
                        out.add(studioDatabase[i].getNume());
        }
        return  out;
    }

    public static List<String> Query3( Studio [] studioDatabase ) {
        List<String> out = new ArrayList<>();
        for (int i = 0; i < studioDatabase.length; i++) {
            for (int j = 0; j < studioDatabase[i].totalMovies(); j++)
                for( int k = 0; k < studioDatabase[i].getFilme().get(j).getActori().size(); k++ )
                    if (studioDatabase[i].getFilme().get(j).getActori().get(k).getVarsta() >= 50)
                        out.add(studioDatabase[i].getFilme().get(j).getNume());
        }
        return  out;
    }

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new ArrayList<Premiu>(Arrays.asList(oscar1990, oscar2000)));
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new ArrayList<Premiu>(Arrays.asList(oscar2010)));
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new ArrayList<Premiu>(Arrays.asList(oscar2018)));
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new ArrayList<Premiu>(Arrays.asList()));
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new ArrayList<Premiu>(Arrays.asList()));
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new ArrayList<Premiu>(Arrays.asList()));

        Film film1 = new Film(1990,"film cu actori de oscar", new ArrayList<>(Arrays.asList(actorOscar1990, actorFaraPremii01)));
        Film film2 = new Film(2010, "film cu actori fara premii2", new ArrayList<>(Arrays.asList(actorFaraPremii01,actorFaraPremii02, actorFaraPremii03)));
        Film film3 = new Film(2010, "film cu actori fara premii3", new ArrayList<>(Arrays.asList(actorFaraPremii01,actorFaraPremii02, actorFaraPremii03)));
        Film film4 = new Film(2018, "film cu actori de oscar", new ArrayList<>(Arrays.asList(actorOscar2010, actorOscar2018, actorFaraPremii02)));
        Film film5 = new Film(2018, "film cu actori fara premii5", new ArrayList<>(Arrays.asList(actorFaraPremii02, actorFaraPremii03)));

        Studio studio1 = new Studio("MGM", new ArrayList<>(Arrays.asList(film1, film2)));
        Studio studio2 = new Studio("Disney", new ArrayList<>(Arrays.asList(film3, film4, film5)));

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        List<String> query1 =  Query1( studioDatabase );
        for( String str : query1 )
            System.out.println(str);

        List<String> query2 =  Query2( studioDatabase );
        for( String str : query2 )
            System.out.println(str);

        List<String> query3 =  Query3( studioDatabase );
        for( String str : query3 )
            System.out.println(str);
    }
}
