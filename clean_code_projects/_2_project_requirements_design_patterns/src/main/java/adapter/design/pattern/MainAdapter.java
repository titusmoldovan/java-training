package adapter.design.pattern;

/*
Consider we want to travel from Europe to USA.
Whereas in Europe we use euro currency, in USA it is used dollar currency.
So, we need to make de conversion from euros to dollars.
Because at the base it is still money, we just need an adaptor for currency.
 */

public class MainAdapter {
    public static void main(String[] args) {
        EuroCurrency amount = new Amount();
        DollarCurrencyAdapter amountAdapter = new DollarCurrencyAdapterImpl(amount);

        System.out.println(amountAdapter.getDollars());
    }
}
