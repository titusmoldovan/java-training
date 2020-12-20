package code._4_student_effort.ChallengeThree;

public class GenericList<T> implements IGenericList<T> {

    private IGenericNode<T> rootValue;

    public GenericList(T rootValue) {
        this.rootValue = new GenericNode<>();
        this.rootValue.setValue(rootValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> current = rootValue;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        IGenericNode<T> node = new GenericNode<>();
        node.setValue(element);
        current.setNext(node);

    }

    @Override
    public void println() {
        IGenericNode<T> current = this.rootValue;
        System.out.print(current.getValue() + " ");
        while (current.getNext() != null) {
            current = current.getNext();
            System.out.print(current.getValue() + " ");

        }
    }
}
