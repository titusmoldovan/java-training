package code._4_student_effort.hash_table;

import java.util.Arrays;
import java.util.List;

public class MyHashTableImpl<K, V> implements MyHashTable<K, V>{
    private final List<Object> values;
    private int size;

    public MyHashTableImpl() {
        values = Arrays.asList(new Object[1000000000]);
        size = 0;
    }

    @Override
    public V get(K key) {
        return (V) values.get(key.hashCode());
    }

    @Override
    public void put(K key, V value) {
        values.set(key.hashCode(), value);
        size++;
    }

    @Override
    public void remove(K key) {
        values.set(key.hashCode(), null);
        size--;
    }

    @Override
    public boolean containsKey(K key) {
        return values.get(key.hashCode()) != null;
    }

    @Override
    public int size() {
        return size;
    }
}
