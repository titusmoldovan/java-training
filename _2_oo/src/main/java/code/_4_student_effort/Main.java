package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    Fighter f1 = new Fighter("Max", 50, 10);
    Fighter f2 = new Fighter("Bob", 20, 20);
    BoxingMatch box = new BoxingMatch(f1, f2);
    System.out.println(box.fight());
  }
}
