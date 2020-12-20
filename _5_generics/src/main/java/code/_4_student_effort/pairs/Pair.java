package code._4_student_effort.pairs;

public class Pair<T extends Shoe> {
    private final T first;
    private final T second;

    private void checkIfPair(T firstElement, T secondElement) throws Exception {
        if (!firstElement.getColor().equals(secondElement.getColor()))
            throw new Exception("Colors don't match");
        if (firstElement.getSize() != secondElement.getSize())
            throw new Exception("Sizes don't match");
    }

    public Pair(T firstElement, T secondElement) throws Exception {
        checkIfPair(firstElement, secondElement);
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
}
