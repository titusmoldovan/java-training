package code._4_student_effort.hard.decorations;


public class Bulb extends Decoration{

    public Bulb(int position, DecorableTree tree){
        super(position, tree);
    }

    @Override
    String getDecoration() {
        return "B";
    }
}
