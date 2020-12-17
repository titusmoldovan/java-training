package code._4_student_effort.Challange4_Iterator;

import code._4_student_effort.Challange3_List.GenericList;

public class ArrayIterator <T> {
    private GenericList<T> localArray;
    public ArrayIterator(GenericList<T> localArray)
    {
        this.localArray = localArray;
    }
    public Boolean hasNext()
    {
        if(localArray.getInsideList().size() == 0)
            return false;
        else
            return true;
    }
    public T next()
    {
        T aux;
        aux = localArray.getInsideList().get(0);
        localArray.getInsideList().remove(0);
        return aux;
    }

}
