package code._4_student_effort.array_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayListImpl<>();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(7);
        System.out.println(myArrayList.size());
        try {
            System.out.println(myArrayList.get(1));
            myArrayList.remove(3);
            System.out.println(myArrayList.get(1));
        } catch (ArrayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myArrayList.size());
    }
}
