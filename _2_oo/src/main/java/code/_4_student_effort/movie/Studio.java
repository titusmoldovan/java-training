package code._4_student_effort.movie;


public class Studio {
    private String name;
    private Film[] films;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film[] getFilms() {
        return films;
    }

    public void setFilms(Film[] films) {
        this.films = films;
    }

    public Studio(String n, Film[] f){
        name = n;
        films = f;
    }

}
