package code._4_student_effort.hash_table;

public class Main {
    public static void main(String[] args) {
        MyHashTable<String, Integer> myHashTable = new MyHashTableImpl<>();
        myHashTable.put("key1", 1);
        myHashTable.put("key2", 2);
        myHashTable.put("key3", 3);
        System.out.println(myHashTable.size());
        System.out.println(myHashTable.containsKey("key4"));
        System.out.println(myHashTable.containsKey("key2"));
        System.out.println(myHashTable.get("key2"));
    }
}
