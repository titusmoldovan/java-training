package code._4_student_effort.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Actor {

    private String nume;
    private Integer varsta;
    private List<Premiu> premii;

    public Actor(String nume, Integer varsta, List<Premiu> premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public List<Premiu> getPremii() {
        return premii;
    }

    public void setPremii(List<Premiu> premii) {
        this.premii = premii;
    }
}
