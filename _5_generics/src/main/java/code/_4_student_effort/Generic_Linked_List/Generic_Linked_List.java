package code._4_student_effort.Generic_Linked_List;

// IN PROGRESS!

interface IGenericList<T>{
    void insert(T element);
    void println();
}

interface IGenericNode<T>{
    T getValue();
    void setValue(T value);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}

class GenericList<T> implements IGenericList<T>{
    private IGenericNode<T> base;

    public GenericList(T baseValue) {
        this.base = new GenericNode<>();
        this.base.setValue(baseValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> aux = this.base;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }

        IGenericNode<T> newPos = new GenericNode();
        newPos.setValue(element);
        aux.setNext(newPos);
    }

    @Override
    public void println() {
        IGenericNode<T> aux = this.base;
        while(aux.getNext() != null){
            aux = aux.getNext();
            System.out.println(aux.getValue());
        }
    }
}

class GenericNode<T> implements IGenericNode<T>{
    private T value;
    private GenericNode<T> next;

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public void setValue(Object value) {
        this.value = (T) value;
    }

    @Override
    public IGenericNode getNext() {
        return this.next;
    }

    @Override
    public void setNext(IGenericNode next) {
        this.value = (T) next;
    }
}

public class Generic_Linked_List {
    public static void main(String[] args) {
        String base = "a";
        GenericList<String> list = new GenericList<>(base);

        for (int i = 0 ; i < 10; i++){
            list.insert(String.valueOf(Character.valueOf((char) (base.charAt(0) + i))));
        }

        list.println();
    }
}
