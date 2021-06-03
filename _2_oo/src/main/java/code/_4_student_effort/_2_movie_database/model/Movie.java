package code._4_student_effort._2_movie_database.model;

import java.util.List;

public class Movie {

    private Integer yearOfRelease;
    private String name;
    private List<Actor> cast;

    public Movie(Integer yearOfRelease, String name, List<Actor> cast) {
        this.yearOfRelease = yearOfRelease;
        this.name = name;
        this.cast = cast;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "yearOfRelease=" + yearOfRelease +
                ", name='" + name + '\'' +
                ", cast=" + cast +
                '}';
    }
}
