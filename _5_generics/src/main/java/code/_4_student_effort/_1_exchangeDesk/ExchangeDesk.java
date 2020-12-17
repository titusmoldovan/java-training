package code._4_student_effort._1_exchangeDesk;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    <T extends Money, F extends Money> T convert(F fromCurrency, Class<T> toClass, double rate)
    {
        T result = null;
        try {
            result = toClass.getDeclaredConstructor().newInstance();
            result.setAmount(fromCurrency.getAmount() * rate);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return result;
    }

}
