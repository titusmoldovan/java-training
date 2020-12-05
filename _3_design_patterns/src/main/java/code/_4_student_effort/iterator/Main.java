package code._4_student_effort.iterator;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3};
        ArrayCustomIterator iterator = new ArrayCustomIterator(array);
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
