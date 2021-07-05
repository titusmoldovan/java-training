public class Film {
    public Film(){

    }
    public Film(Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public boolean findActor(String numeActor){
        int find = 0;
        for (int i = 0; i < actori.length; i++){
            if (actori[i].getNume().equals(numeActor) == true)
                find = 1;
        }

        if (find == 1)
            return true;
        else return false;
    }

    public boolean findActorVarstaPeste (Integer varstaDorita){
        int find = 0;
        for (int i = 0; i< actori.length; i++){
            if(actori[i].getVarsta() > varstaDorita)
                find = 1;
        }
        if(find == 1) return true;
        else return false;
    }

    public String getNume(){
        return this.nume;
    }
}
