package code._4_student_effort.ChallengeFive;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Input input = new Input("_4_exceptions_io/_test_files/out/message.txt");
        HashMap<String, Integer> occurences = input.getOccurrences();
        Occurrence oc = new Occurrence(occurences);
        oc.topXWords(5);
        System.out.println("------");
        oc.topXWords2(5);
    }

}
