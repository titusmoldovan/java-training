package code._4_student_effort.exchange_desk;

import java.util.ArrayList;

public class ExchangeDesk {
    private final ArrayList<ArrayList<String>> rates;

    public ExchangeDesk() {
        this.rates = new ArrayList<>();
    }

    public <initialType extends Currency, finalType extends Currency> finalType convert(initialType initialCurrency, Class<finalType> finalCurrencyClass) {
        finalType finalCurrency = null;
        try {
            finalCurrency = finalCurrencyClass.getConstructor().newInstance();
            for (ArrayList<String> rate: this.rates) {
                if (rate.get(0).equals(initialCurrency.getCurrencyName()) && rate.get(1).equals(finalCurrency.getCurrencyName())) {
                    finalCurrency.setValue(initialCurrency.getValue() * Double.parseDouble(rate.get(2)));
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return finalCurrency;
    }

    public <initialType extends Currency, finalType extends Currency> void addRate(Class<initialType> initialCurrencyClass, Class<finalType> finalCurrencyClass, double rate) {
        initialType initialCurrency = null;
        finalType finalCurrency = null;
        try {
            initialCurrency = initialCurrencyClass.getConstructor().newInstance();
            finalCurrency = finalCurrencyClass.getConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //From A to B at rate R
        ArrayList<String> newRate = new ArrayList<>();
        newRate.add(initialCurrency.getCurrencyName());
        newRate.add(finalCurrency.getCurrencyName());
        newRate.add(String.valueOf(rate));
        this.rates.add(newRate);
        //From B to A at the same rate R
        newRate = new ArrayList<>();
        newRate.add(finalCurrency.getCurrencyName());
        newRate.add(initialCurrency.getCurrencyName());
        newRate.add(String.valueOf(rate));
        this.rates.add(newRate);
    }
}
