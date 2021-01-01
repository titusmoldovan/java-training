package code._4_student_effort.challenge3_generic_linked_list;

public interface IGenericNode<T> {

    T getValue();

    void setValue(T value);

    IGenericNode<T> getNext();

    void setNext(IGenericNode<T> next);
}
