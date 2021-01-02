package code._4_student_effort.set;

public interface MySet<T> {
    void add(T e) throws SetException;

    void remove(T e) throws SetException;

    T get(int index) throws SetException;

    void set(int index, T e) throws SetException;

    int size();

    boolean contains(T e);
}
