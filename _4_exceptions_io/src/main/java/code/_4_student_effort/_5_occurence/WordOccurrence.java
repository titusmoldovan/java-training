package code._4_student_effort._5_occurence;

public class WordOccurrence {
    private final String word;
    private Integer occurrence;

    public WordOccurrence(String word) {
        this.word = word;
        this.occurrence = 1;
    }

    public String getWord() {
        return word;
    }

    public Integer getOccurrence() {
        return occurrence;
    }

    public void increaseOccurrence() {
        this.occurrence++;
    }

    @Override
    public String toString() {
        return "word= " + word +
                ", occurrence= " + occurrence;
    }
}
