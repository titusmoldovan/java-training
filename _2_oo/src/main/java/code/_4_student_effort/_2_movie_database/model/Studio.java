package code._4_student_effort._2_movie_database.model;

import java.util.List;

public class Studio {

    private String name;
    private List<Movie> movieList;

    public Studio(String name, List<Movie> movieList) {
        this.name = name;
        this.movieList = movieList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "name='" + name + '\'' +
                ", movieList=" + movieList +
                '}';
    }
}
