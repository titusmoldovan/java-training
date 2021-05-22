package code._4_student_effort._2_movie_database;

public class Studio {
    private String nume;
    private Film[] filme;
    public Studio(String nume, Film[] filme){
        this.nume=nume;
        this.filme=filme;
    }
    public int numarFilme(){
        return filme.length;
    }
    public String getNumeStudio(){
        return nume;
    }
    public Film[] getFilme(){
        return filme;
    }
}
