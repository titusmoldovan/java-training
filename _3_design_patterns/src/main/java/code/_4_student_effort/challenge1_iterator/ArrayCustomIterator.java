package code._4_student_effort.challenge1_iterator;

public class ArrayCustomIterator {

    private int[] arr;
    private int cursor;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.cursor = 0;
    }

    public boolean hasNext() {
        return cursor != arr.length;
    }

    public int next() {
        return arr[cursor++];
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

