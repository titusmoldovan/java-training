package code._4_student_effort.set;

import java.util.Arrays;

public class MySetImpl<T> implements MySet<T> {
    private Object[] values;
    private int size;
    private int capacity;

    public MySetImpl() {
        capacity = 100;
        values = new Object[capacity];
        size = 0;
    }

    private void resize() {
        capacity = capacity * 2;
        values = Arrays.copyOf(values, capacity);
    }

    @Override
    public void add(T e) throws SetException {
        if (!contains(e)) {
            if (size == capacity)
                resize();
            values[size++] = e;
        } else
            throw new SetException("Element already exists");
    }

    @Override
    public void remove(T e) throws SetException {
        int index = 0;
        while (!e.equals(values[index]) && index < size)
            index++;
        if (index != size) {
            Object[] newValues = Arrays.copyOfRange(values, 0, index);
            newValues = Arrays.copyOf(newValues, capacity);
            while (index != size) {
                newValues[index] = values[index + 1];
                index++;
            }
            values = newValues;
            size--;
        } else
            throw new SetException("Element doesn't exist");
    }

    @Override
    public T get(int index) throws SetException {
        if (index < size)
            return (T) values[index];
        else
            throw new SetException("Index out of range");
    }

    @Override
    public void set(int index, T e) throws SetException {
        if (index < size) {
            if (!contains(e))
                values[index] = e;
            else
                throw new SetException("Element already exists");
        } else
            throw new SetException("Index out of range");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++)
            if (values[i].equals(e))
                return true;
        return false;
    }
}
