package code._4_student_effort.exchange_desk;

public class USD extends Currency {
    public USD() {
        super();
    }

    public USD(double value) {
        super(value);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }

    @Override
    public String toString() {
        return super.toString() + " USD";
    }
}
