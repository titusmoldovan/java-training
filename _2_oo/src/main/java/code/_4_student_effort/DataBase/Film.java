package code._4_student_effort.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private Integer anAparitie;
    private String nume;
    private List<Actor> actori;

    public Film(Integer anAparitie, String nume, List<Actor> actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Actor> getActori() {
        return actori;
    }

    public void setActori(List<Actor> actori) {
        this.actori = actori;
    }
}
