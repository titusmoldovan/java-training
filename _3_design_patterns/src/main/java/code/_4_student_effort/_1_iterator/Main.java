package code._4_student_effort._1_iterator;

public class Main {

    public static void main(String[] args) {

        Repository integersRepo = new Repository();

        for (int i = 0; i <= 100; i++) {
            integersRepo.getIntegers().add(i);
        }
        Iterator iterator = integersRepo.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Number : " + iterator.next());
        }
    }
}
