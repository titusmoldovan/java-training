package code._4_student_effort.challenge3_generic_linked_list;

public class GenericList<T> implements IGenericList<T> {

    private IGenericNode<T> root;

    public GenericList(T rootValue) {
        this.root = new GenericNode<>();
        this.root.setValue(rootValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> cursor = this.root;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }

        code._2_challenge._3_generic_linked_list.IGenericNode<T> newNode = new code._2_challenge._3_generic_linked_list.GenericNode();
        newNode.setValue(element);
        cursor.setNext(newNode);
    }

    @Override
    public void println() {

        IGenericNode<T> cursor = this.root;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
            System.out.println(cursor.getValue());
        }
    }
}
