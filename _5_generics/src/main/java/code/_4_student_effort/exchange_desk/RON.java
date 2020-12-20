package code._4_student_effort.exchange_desk;

public class RON extends Currency {
    public RON() {
        super();
    }

    public RON(double value) {
        super(value);
    }

    @Override
    public String getCurrencyName() {
        return "RON";
    }

    @Override
    public String toString() {
        return super.toString() + " RON";
    }
}
