package code._4_student_effort._5_occurence;

import java.util.Comparator;

public class Sorter implements Comparator<WordOccurrence> {

    @Override
    public int compare(WordOccurrence o1, WordOccurrence o2) {
        return o1.getOccurrence().compareTo(o2.getOccurrence());
    }
}
