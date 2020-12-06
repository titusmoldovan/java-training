package code._4_student_effort.hardcode_challenge_decorator;


public class DecorationsExample {

    public static void main(String args[]) {

        ChristmasTree christmasTree=new ChristmasTree();
        christmasTree.display();


        DecorableTree decoratedTree = christmasTree;
        decoratedTree = new CandyDecoration(3, decoratedTree);
        decoratedTree = new BulbDecoration(6, decoratedTree);
        decoratedTree = new GarlandDecoration(8, decoratedTree);

        decoratedTree.display();

    }
}
