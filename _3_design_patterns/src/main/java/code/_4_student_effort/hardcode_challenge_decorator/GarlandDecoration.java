package code._4_student_effort.hardcode_challenge_decorator;

public class GarlandDecoration extends Decoration {

    public GarlandDecoration(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "G";
    }
}
