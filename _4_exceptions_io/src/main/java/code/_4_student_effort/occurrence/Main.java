package code._4_student_effort.occurrence;

import code._4_student_effort.ReadFromFile;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile("_4_exceptions_io/_test_files/in/a.txt");
        Occurrence occurrence = new Occurrence();
        System.out.println(occurrence.getTop10Occurrences(readFromFile.getText()));
    }
}
