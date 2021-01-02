package code._4_student_effort.challenge9_set;

public class Main {

    public static void main(String[] args) {
        MySet<String> mySet=new MySetImpl<>();

        mySet.add("Ana");
        mySet.add("Roxana");
        mySet.add("Mara");
        mySet.add("Dana");
        mySet.add("Dana");

        for(int i=0;i<mySet.size();i++) {
            System.out.println(mySet.get(i));
        }
    }
}
