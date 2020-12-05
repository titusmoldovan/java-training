package code._4_student_effort.hard.decorations;


public class Candy extends Decoration {

    public Candy(int position, DecorableTree tree) {
        super(position, tree);
    }

    @Override
    String getDecoration() {
        return "C";
    }
}
