package adapter.design.pattern;

public class DollarCurrencyAdapterImpl implements DollarCurrencyAdapter {
    private EuroCurrency euroAmount;

    public DollarCurrencyAdapterImpl(EuroCurrency euroAmount) {
        this.euroAmount = euroAmount;
    }

    @Override
    public double getDollars() {
        return convertEurosToDollars(euroAmount.getEuros());
    }

    private double convertEurosToDollars(double euros){
        return euros * Constants.EXCHANGE_RATE;
    }

}
