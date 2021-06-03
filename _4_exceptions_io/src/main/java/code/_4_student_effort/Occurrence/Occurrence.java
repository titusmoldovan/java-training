package code._4_student_effort.Occurrence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Occurrence {
    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<String, Integer>();
        countWords(words);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        System.out.println("Sorted Map   : " + sortedMap);
    }

    static void countWords(Map<String, Integer> words) {

        Scanner lineFromFile = null;
        try {
            lineFromFile = new Scanner(new File("_4_exceptions_io/_test_files/in/a.txt"));
            while (lineFromFile.hasNextLine()) {
                Scanner wordFromLine = new Scanner(lineFromFile.nextLine());
                while (wordFromLine.hasNext()) {
                    String str = wordFromLine.next();
                    words.put( str, (words.get(str) == null ) ? 1 : words.get(str) + 1 );
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
