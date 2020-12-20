package code._4_student_effort.exchange_desk;

public abstract class Currency {
    private double value;

    Currency() {
    }

    Currency(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract String getCurrencyName();

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
