package code._4_student_effort.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Studio {

    private String nume;
    private List<Film> filme;

    public Studio(String nume, List<Film> filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public Integer totalMovies () {
        return filme.size();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Film> getFilme() {
        return filme;
    }

    public void setFilme(List<Film> filme) {
        this.filme = filme;
    }
}
