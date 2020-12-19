package code._4_student_effort.challenge5_occurence;

public class OccurenceTest {

    public static void main(String[] args) {

        Reader reader=new Reader("message.txt");

        System.out.println(reader.countOccurenceOfWordInFile("the"));
    }
}
