package code._4_student_effort.ChallengeOne;

public class ArrayCustomIterator {

    private int[] arr;
    private int currentIndex;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        currentIndex = 0;
    }

    public boolean hasNext() {

        return currentIndex > arr.length - 1 ? false : true;

    }

    public int next() {

        return arr[currentIndex++];

    }
}
