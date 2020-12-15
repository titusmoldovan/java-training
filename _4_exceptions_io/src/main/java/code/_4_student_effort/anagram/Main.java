package code._4_student_effort.anagram;

import code._4_student_effort.ReadFromFile;
import code._4_student_effort.WriteToFile;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile("_4_exceptions_io/_test_files/in/small_list.txt");
        WriteToFile writeToFile = new WriteToFile("_4_exceptions_io/src/main/java/code/_4_student_effort/anagram/anagram.txt");
        writeToFile.writeText((new Anagram()).getAnagramsOfTextWords(readFromFile.getText()));
    }
}
