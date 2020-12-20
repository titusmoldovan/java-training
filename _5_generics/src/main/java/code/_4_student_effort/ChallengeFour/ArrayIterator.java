package code._4_student_effort.ChallengeFour;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        return array[currentIndex++];
    }
}
