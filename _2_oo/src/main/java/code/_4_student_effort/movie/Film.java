package code._4_student_effort.movie;


public class Film {
    private int releasedYear;
    private String name;
    private Actor[] actors;

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public Film(int ry, String n, Actor[] a){
        releasedYear = ry;
        name = n;
        actors = a;
    }
}
