package code._4_student_effort.DesignPatternsChallenge1;

public class ArrayCustomIterator {
    private final int[] arr;
    private int positionIndex;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        positionIndex = 0;
    }

    public boolean hasNext() {
        return positionIndex < arr.length;
    }

    public int next() {
        return arr[positionIndex++];
    }
}
