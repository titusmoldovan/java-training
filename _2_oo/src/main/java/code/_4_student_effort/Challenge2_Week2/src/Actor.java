public class Actor {
    public Actor(){

    }

    public Actor(String nume, Integer varsta, Premiu[] premii){
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public String getNume(){
        return this.nume;
    }

    public Integer getVarsta(){
        return this.varsta;
    }
}
