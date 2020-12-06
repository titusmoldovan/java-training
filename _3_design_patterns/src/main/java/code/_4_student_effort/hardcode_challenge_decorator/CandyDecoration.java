package code._4_student_effort.hardcode_challenge_decorator;


public class CandyDecoration extends Decoration {

    public CandyDecoration(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}
