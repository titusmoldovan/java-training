package code._4_student_effort.movie;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        System.out.println(database.studiosNameWithMoreThan2FilmsRealeased());
        System.out.println(database.studiosNameHavingActorWithName("actor with 2 oscars"));
        System.out.println(database.moviesNameHavingActorAboveAge(50));
    }
}
