package code._4_student_effort.array_list;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T> {
    private Object[] values;
    private int size;
    private int capacity;

    public MyArrayListImpl() {
        capacity = 100;
        values = new Object[capacity];
        size = 0;
    }

    private void resize() {
        capacity = capacity * 2;
        values = Arrays.copyOf(values, capacity);
    }

    @Override
    public void add(T e) {
        if (size == capacity)
            resize();
        values[size++] = e;
    }

    @Override
    public void remove(T e) throws ArrayException {
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
        }
        else
            throw new ArrayException("Element doesn't exist");
    }

    @Override
    public T get(int index) throws ArrayException {
        if (index < size)
            return (T) values[index];
        else
            throw new ArrayException("Index out of range");
    }

    @Override
    public void set(int index, T e) throws ArrayException {
        if (index < size)
            values[index] = e;
        else
            throw new ArrayException("Index out of range");
    }

    @Override
    public int size() {
        return size;
    }
}
