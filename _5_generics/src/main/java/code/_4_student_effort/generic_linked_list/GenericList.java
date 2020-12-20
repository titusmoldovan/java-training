package code._4_student_effort.generic_linked_list;

public class GenericList<T> implements IGenericList<T>{
    private IGenericNode<T> rootNode;

    public GenericList(T rootValue) {
        this.rootNode = new GenericNode<T>(rootValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> node = this.rootNode;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new GenericNode<T>(element));
    }

    @Override
    public void println() {
        IGenericNode<T> node = this.rootNode;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    @Override
    public IGenericNode<T> getRoot() {
        return this.rootNode;
    }
}
