package adapter.design.pattern;

public class Amount implements EuroCurrency {

    @Override
    public double getEuros() {
        return 1500;
    }
}
