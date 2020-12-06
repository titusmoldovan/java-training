package code._4_student_effort.hardcode_challenge_decorator;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree implements DecorableTree {
    private List<List<String>> tree;
    private int size;

    public ChristmasTree() {
        this.size = 10;
        this.tree = getTree();
    }

    @Override
    public List<List<String>> getTree() {
        List<List<String>> tree = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < size - i; j++) {
                row.add(" ");
            }
            row.add("<");
            for (int j = 0; j < i * 2; j++) {
                row.add(" ");
            }
            row.add(">");
            tree.add(row);
        }

        for (int i = 0; i < 3; i++) {
            List<String> row = new ArrayList<>();
            row.add("        |    |");
            tree.add(row);
        }

        return tree;
    }

    @Override
    public void display() {

        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++)
                System.out.print(tree.get(i).get(j));
            System.out.println();
        }
    }
}
