package code._4_student_effort.ChallengeTwo;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) {
        try {
            if (firstElement.getColor() != secondElement.getColor()) {
                throw new ColorsDoNotMatchException("Culorile nu se potrivesc");
            }
            if (firstElement.getNumber() != secondElement.getNumber()) {
                throw new SizeDoNotMatchException("Marimile nu se potrivesc");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            ex.getMessage();
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
