package code._4_student_effort.challenge8_array_list;

public class Main {

    public static void main(String[] args) {
    MyArrayList<Integer> list = new MyArrayListImpl<>();

    for(int i=0; i<10; i++) {
        list.add(i);
    }

    list.remove(9);
    list.set(5, 14);

    for(int i=0;i<list.size();i++) {
        System.out.println(list.get(i));
    }
}}
