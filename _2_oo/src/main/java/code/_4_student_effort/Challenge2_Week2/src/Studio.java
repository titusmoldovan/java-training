public class Studio {
    public Studio(){

    }
    public Studio(String nume, Film[] filme){
        this.nume = nume;
        this.filme = filme;
    }
    private String nume;
    private Film[] filme;

    public int getNrFilme(){
        return this.filme.length;
    }

    public String getNume(){
        return this.nume;
    }

    public boolean findActor(String numeActor){
        int find = 0;
        for(int i = 0; i < filme.length; i++){
            if (filme[i].findActor(numeActor) == true)
                find = 1;
        }
        if (find == 1) return true;
        else return false;

    }

}
