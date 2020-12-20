package code._4_student_effort.ChallengeOne;

public class ExchangePair<F, T> {
    F fromPair;
    T toPair;

    public ExchangePair(F fromPair, T toPair) {
        this.fromPair = fromPair;
        this.toPair = toPair;
    }

    public F getFromPair() {
        return fromPair;
    }

    public T getToPair() {
        return toPair;
    }

    public void setFromPair(F fromPair) {
        this.fromPair = fromPair;
    }

    public void setToPair(T toPair) {
        this.toPair = toPair;
    }
}
