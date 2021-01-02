package code._4_student_effort.challenge7_hash_table;

public class MyHashTableImpl<K, V> implements MyHashTable<K, V> {

    private Object[] objects = new Object[Integer.MAX_VALUE / 100];
    private int size = 0;

    @Override
    public V get(K key) {
        return (V) objects[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        objects[key.hashCode()] = value;
        size++;
    }

    @Override
    public void remove(K key) {
        objects[key.hashCode()] = null;
    }

    @Override
    public boolean containsKey(K key) {
        return objects[key.hashCode()] != null;
    }

    @Override
    public int size() {
        return size;
    }
}
