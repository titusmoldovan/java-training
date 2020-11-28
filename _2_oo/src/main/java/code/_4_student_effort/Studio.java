package _4_student_effort;

public class Studio {
    private String name;
    Film[] movies;

    public Studio(String nameStudio, Film[] movies){
        this.name = nameStudio;
        this.movies = movies;
    }
    public String getName(){
        return name;
    }
    public Film[] getMovies(){
        return movies;
    }
}
