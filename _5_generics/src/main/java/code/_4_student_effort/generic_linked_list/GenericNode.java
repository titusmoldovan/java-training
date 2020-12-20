package code._4_student_effort.generic_linked_list;

public class GenericNode<T> implements IGenericNode<T>{
    private T value;
    private IGenericNode<T> nextNode;

    public GenericNode (T value) {
        this.value = value;
        this.nextNode = null;
    }

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return this.nextNode;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.nextNode = next;
    }
}
