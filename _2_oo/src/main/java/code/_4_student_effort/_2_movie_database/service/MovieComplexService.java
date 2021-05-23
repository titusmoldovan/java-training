package code._4_student_effort._2_movie_database.service;

import code._4_student_effort._2_movie_database.model.Actor;
import code._4_student_effort._2_movie_database.model.Movie;
import code._4_student_effort._2_movie_database.model.Prize;
import code._4_student_effort._2_movie_database.model.Studio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieComplexService {

    private static MovieComplexService movieComplexService;
    private List<Actor> actors = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();
    private List<Prize> prizes = new ArrayList<>();
    private List<Studio> studios = new ArrayList<>();

    public static MovieComplexService getInstance() {
        if (movieComplexService == null) {
            movieComplexService = new MovieComplexService();
        }
        return movieComplexService;
    }

    public List<Studio> publishedMoreThan2MoviesStudios() {
        return studios.stream().filter(studio -> studio.getMovieList().size() >= 2).collect(Collectors.toList());
    }

    public List<Studio> studiosWithCertainActorName(String actorName) {
        List<Studio> answer = new ArrayList<>();
        for (Studio studio : studios) {
            if (helper(actorName, studio.getMovieList())) {
                answer.add(studio);
            }
        }
        return answer;
    }

    public static boolean helper(String actorName, List<Movie> studioMovies) {
        for (Movie studioMovie : studioMovies) {
            List<Actor> studioActors = studioMovie.getCast();
            if (studioActors.stream().anyMatch(actor -> actor.getName().equals(actorName))) {
                return true;
            }
        }
        return false;
    }

    public List<Movie> moviesInWhichArePlayingActorsAboveAge(Integer age) {
        List<Movie> aboveAge = new ArrayList<>();
        for (Movie movie : movies) {
            for (Actor actor : movie.getCast()) {
                if (actor.getAge() >= age) {
                    aboveAge.add(movie);
                }
            }
        }
        return aboveAge;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }
}
