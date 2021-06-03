package code._4_student_effort.Phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {
        HashMap<String, String > phonebook = new HashMap<String, String>();
        populatePhonebook( phonebook );
        System.out.println(phonebook.get("Abbey"));
        System.out.println(phonebook.get("Abdul"));
    }

    static void populatePhonebook( HashMap<String, String> phonebook ) {

        Scanner lineFromFile = null;
        try {
            lineFromFile = new Scanner(new File("_4_exceptions_io/_test_files/in/phonebook.txt"));
            while (lineFromFile.hasNextLine()) {
                Scanner wordFromLine = new Scanner(lineFromFile.nextLine());
                while (wordFromLine.hasNext()) {
                    phonebook.put(wordFromLine.next(), wordFromLine.next());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if( lineFromFile != null )
                lineFromFile.close();
        }

    }
}
