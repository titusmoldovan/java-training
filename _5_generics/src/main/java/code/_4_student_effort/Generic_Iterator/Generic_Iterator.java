package code._4_student_effort.Generic_Iterator;

interface IArrayIterator<T>{
    boolean hasNext();
    T next();
}

class ArrayIterator<T> implements IArrayIterator<T>{
    private final T[] arr;
    private int position;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return (position < arr.length);
    }

    @Override
    public T next() {
        return arr[position++];
    }

}

public class Generic_Iterator {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
