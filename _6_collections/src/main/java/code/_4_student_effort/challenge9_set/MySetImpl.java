package code._4_student_effort.challenge9_set;

import java.util.Arrays;

public class MySetImpl<T> implements MySet<T> {

    private Object[] list = new Object[0];

    @Override
    public void add(T e) {
        if (!contains(e)) {
            this.list = Arrays.copyOf(list, list.length + 1);
            this.list[this.list.length - 1] = e;
        }
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
        if (!contains(e)) {
            this.list[index] = e;
        }
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public boolean contains(T e) {
        boolean isContaining = false;
        for (Object currentElement : this.list) {
            if (currentElement.equals(e)) {
                isContaining = true;
                break;
            }
        }
        return isContaining;
    }
}
