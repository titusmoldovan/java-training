package code._4_student_effort.challenge8_array_list;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private Object list[]=new Object[0];

    @Override
    public void add(T e) {
        list = Arrays.copyOf(list, list.length + 1);
        list[list.length - 1] = e;
    }

    @Override
    public void remove(T e) {
        Object[] newList = new Object[0];
        for (Object currentElement : this.list) {
            if (!currentElement.equals(e)) {
                newList = Arrays.copyOf(newList, newList.length + 1);
                newList[newList.length - 1] = currentElement;
            }
        }
        this.list = newList;
    }

    @Override
    public T get(int index) {
        return (T) list[index];
    }

    @Override
    public void set(int index, T e) {
        list[index]=e;

    }

    @Override
    public int size() {
        return list.length;
    }
}
