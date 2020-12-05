package code._4_student_effort.hard.decorations;

public class Main {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        DecorableTree decoratedTree = new Garland(8, new Bulb(6, new Candy(3, christmasTree)));
        decoratedTree.display();
        System.out.println();
        christmasTree.display();
    }
}
