package _4_student_effort;

public class Film {
    private int releaseYear;
    private String name;
    Actor[] actori;

    public Film(int release, String movie_name, Actor[] actors)
    {
        this.releaseYear = release;
        this.name = movie_name;
        this.actori = actors;
    }
    public String getMovieName(){
        return name;
    }
    public int getReleaseYear(){
        return  releaseYear;
    }
    public Actor[] getActori(){
        return actori;
    }

}
