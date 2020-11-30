package code._4_student_effort.Challenge1;

public class Main {

    public static void main(String[] args) {
        Fighter Adam = new Fighter("Adam", 80, 30);
        Fighter Scott = new Fighter("Scott", 870, 25);
        BoxingMatch boxingMatch = new BoxingMatch(Adam, Scott);

        System.out.println(boxingMatch);

    }
}
