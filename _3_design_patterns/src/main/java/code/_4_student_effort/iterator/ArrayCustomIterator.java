package code._4_student_effort.iterator;

public class ArrayCustomIterator {
    private int position;
    private final int[] array;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        position = 0;
    }

    public boolean hasNext() {
        return position < array.length;
    }

    public int next() {
        return array[position++];
    }
}
