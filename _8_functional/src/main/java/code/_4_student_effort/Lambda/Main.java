package code._4_student_effort.Lambda;

public class Main {

    public static void main(String[] args) {

        ExOne ex1 = new ExOne();
        System.out.println(ex1);

        ExTwo ex2 = new ExTwo();
        System.out.println(ex2.getList());

        ExThree ex3 = new ExThree();
        System.out.println(ex3.getList());

        ExFour ex4 = new ExFour();
        System.out.println(ex4.getSb());

        new Thread(new ExFive()).start();

    }
}
