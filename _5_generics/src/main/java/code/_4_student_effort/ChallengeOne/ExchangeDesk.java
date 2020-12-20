package code._4_student_effort.ChallengeOne;

import java.util.HashMap;
import java.util.Map;

public class ExchangeDesk {
    private Map<ExchangePair, Double> currencyRates = new HashMap<>();

    public <T extends Currency, F extends Currency> T convertWithRate(F fromCurrency, Class<T> toClass, double rate) {
        T toCurrency = null;
        try {
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            toCurrency.setAmount(fromCurrency.getAmount() * rate);
        } catch (Exception e) {
            throw new ExchangeDeskException(e.getMessage());
        }
        return toCurrency;
    }

    public <T extends Currency, F extends Currency> T convert(F fromCurrency, Class<T> toClass) {
        T toCurrency = null;
        try {
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            toCurrency.setAmount(fromCurrency.getAmount() * currencyRates.get(getExchangePair(fromCurrency.getClass(), toClass)));
        } catch (Exception e) {
            throw new ExchangeDeskException(e.getMessage());
        }
        return toCurrency;
    }

    private ExchangePair getExchangePair(Class fromClass, Class toClass) {
        for (ExchangePair ep : currencyRates.keySet()) {
            if (ep.getToPair() == toClass && ep.getFromPair() == fromClass) {
                return ep;
            }
        }
        return null;
    }

    public <T extends Currency, F extends Currency> void addRate(Class<F> fromCurrency, Class<T> toCurrency, double rate) {
        if (!pair(fromCurrency, toCurrency)) {
            currencyRates.put(new ExchangePair(fromCurrency, toCurrency), rate);
            currencyRates.put(new ExchangePair(toCurrency, fromCurrency), 1 / rate);
        } else {
            for (ExchangePair ex : currencyRates.keySet()) {
                if (ex.getFromPair() == fromCurrency && ex.getToPair() == toCurrency) {
                    currencyRates.put(ex, rate);
                }
                if (ex.getFromPair() == toCurrency && ex.getToPair() == fromCurrency) {
                    currencyRates.put(ex, 1 / rate);
                }
            }
        }
    }

    private <F extends Currency, T extends Currency> boolean pair(Class<F> fromCurrency, Class<T> toCurrency) {
        for (ExchangePair ex : currencyRates.keySet()) {
            if (ex.getFromPair() == fromCurrency && ex.getToPair() == toCurrency) {
                return true;
            }

        }
        return false;
    }
}
