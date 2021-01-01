package code._4_student_effort.challenge2_pairs;

import code._2_challenge._2_pairs.SizesDoNotMatchException;

public class Pair<S extends Shoe> {

    private S first;
    private S second;

    public Pair(S first, S second) {
        this.first = first;
        this.second = second;
        checkIfMatch(first,second);
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    private void checkIfMatch(S firstElement, S secondElement) {
        if (firstElement.getSize() != secondElement.getSize()) {
            throw new SizesDoNotMatchException("Sizes do not match");
        }
        if (!firstElement.getColor().equals(secondElement.getColor())) {
            throw new SizesDoNotMatchException("colors do not match");
        }
    }
}
