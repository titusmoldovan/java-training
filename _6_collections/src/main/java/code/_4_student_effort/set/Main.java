package code._4_student_effort.set;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySetImpl<Integer>();
        try {
            mySet.add(1);
            mySet.add(2);
            System.out.println(mySet.size());
            System.out.println(mySet.contains(3));
            mySet.remove(3);
        } catch (SetException e) {
            System.out.println(e.getMessage());
        }
    }
}
