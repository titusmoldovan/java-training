package code._4_student_effort._2_movie_database;

import code._4_student_effort._2_movie_database.model.Actor;
import code._4_student_effort._2_movie_database.model.Movie;
import code._4_student_effort._2_movie_database.model.Prize;
import code._4_student_effort._2_movie_database.model.Studio;
import code._4_student_effort._2_movie_database.service.MovieComplexService;

import java.util.Random;

public class Main {

    private static final MovieComplexService movieComplexService = MovieComplexService.getInstance();

    public static void main(String[] args) {

        initData();
//        movieComplexService.getStudios().forEach(System.out::println);
//        movieComplexService.getMovies().forEach(System.out::println);
//        movieComplexService.getActors().forEach(System.out::println);
//        movieComplexService.getPrizes().forEach(System.out::println);
        System.out.println("--------Criteria 1--------");
        movieComplexService.publishedMoreThan2MoviesStudios().forEach(System.out::println);
        System.out.println("--------Criteria 2--------");
        movieComplexService.moviesInWhichArePlayingActorsAboveAge(20).forEach(System.out::println);
        System.out.println("--------Criteria 3--------");
        movieComplexService.studiosWithCertainActorName("testActor4").forEach(System.out::println);

    }

    public static void initData() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            movieComplexService.getPrizes().add(new Prize(String.valueOf(i + 1), 2021 - Math.abs(random.nextInt() % 10)));
        }
        for (int i = 0; i < 40; i++) {
            movieComplexService.getActors().add(new Actor("testActor" + Math.abs(random.nextInt() % 10), Math.abs(random.nextInt() % 40),
                    movieComplexService.getPrizes().subList(i + 2, i + 6)));
        }
        for (int i = 0; i < 20; i++) {
            movieComplexService.getMovies().add(new Movie(2021 - Math.abs(random.nextInt() % 10), "testMovie" + i,
                    movieComplexService.getActors().subList(i + 2, i + 6)));
        }
        for (int i = 0; i < 10; i++) {
            movieComplexService.getStudios().add(new Studio("testStudio" + i, movieComplexService.getMovies().subList(i + 2, i + 6)));
        }
    }
}
