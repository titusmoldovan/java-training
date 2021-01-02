package code._4_student_effort.array_list;

public interface MyArrayList<T> {
    void add(T e);

    void remove(T e) throws ArrayException;

    T get(int index) throws ArrayException;

    void set(int index, T e) throws ArrayException;

    int size();
}
