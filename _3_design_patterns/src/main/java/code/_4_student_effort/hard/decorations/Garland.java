package code._4_student_effort.hard.decorations;

public class Garland extends Decoration{

    public Garland(int position, DecorableTree tree) {
        super(position, tree);
    }

    @Override
    String getDecoration() {
        return "G";
    }
}
