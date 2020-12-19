package code._4_student_effort.challenge3_anagram;

public class AnagramsTest {

    public static void main(String[] args) {

        Reader reader = new Reader("words.txt");
        Writer writer = new Writer("output.txt");

        writer.writeAnagramsToFile(reader.getAnagramsFromFile("listen"));
    }
}
