package code._4_student_effort.ChallengeThree;

public interface IGenericNode<T> {

    public T getValue();
    public IGenericNode getNext();
    public void setNext(IGenericNode<T> node);
    public void setValue(T value);

}
