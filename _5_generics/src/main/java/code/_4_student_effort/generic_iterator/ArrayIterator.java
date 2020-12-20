package code._4_student_effort.generic_iterator;

import code._4_student_effort.generic_linked_list.IGenericList;
import code._4_student_effort.generic_linked_list.IGenericNode;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private IGenericList<T> arr;
    private IGenericNode<T> currentNode;

    public ArrayIterator(IGenericList<T> arr) {
        this.arr = arr;
        this.currentNode = arr.getRoot();
    }

    @Override
    public boolean hasNext() {
        return currentNode.getNext() != null;
    }

    @Override
    public T next() {
        T value = currentNode.getValue();
        currentNode = currentNode.getNext();
        return value;
    }
}
