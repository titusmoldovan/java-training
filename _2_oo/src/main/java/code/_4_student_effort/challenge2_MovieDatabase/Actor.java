package code._4_student_effort.challenge2_MovieDatabase;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta , Premiu[] premii){
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }
    public Integer getVarsta() {
        return varsta;
    }
}
