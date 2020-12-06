package code._4_student_effort.hardcode_challenge_decorator;

public class BulbDecoration extends Decoration {

    public BulbDecoration(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "B";
    }
}
