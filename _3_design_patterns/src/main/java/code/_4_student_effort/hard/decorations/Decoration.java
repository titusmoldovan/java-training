package code._4_student_effort.hard.decorations;

import java.util.ArrayList;
import java.util.List;

public abstract class Decoration implements DecorableTree{
    private final DecorableTree tree;
    private final int position;

    public Decoration(int position, DecorableTree tree){
        this.position = position;
        this.tree = tree;
    }

    abstract String getDecoration();

    @Override
    public List<List<String>> getTree() {
        List<List<String>> tree = new ArrayList<>(this.tree.getTree());
        List<String> newRow = new ArrayList<>(tree.get(position));
        for (int i = tree.get(position).indexOf("<") + 1; i < tree.get(position).indexOf(">"); i++)
            newRow.set(i, this.getDecoration());
        tree.set(position, newRow);
        return tree;
    }

    @Override
    public void display() {
        for (List<String> elements : this.getTree()) {
            for (String element : elements)
                System.out.print(element);
            System.out.println();
        }
    }
}
