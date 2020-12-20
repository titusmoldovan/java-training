package code._4_student_effort.ChallengeOne;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON lei = new RON(1_000);
//        USD dollar = exchangeDesk.convertWithRate(lei,USD.class,0.83);
//        System.out.println(dollar);


        exchangeDesk.addRate(EUR.class, USD.class, 1.23);
        exchangeDesk.addRate(EUR.class, RON.class, 4.87);
        exchangeDesk.addRate(USD.class, RON.class, 3.97);

        USD dollar = exchangeDesk.convert(lei, USD.class);
        System.out.println(dollar);
        EUR euros = exchangeDesk.convert(dollar, EUR.class);
        System.out.println(euros);
        lei = exchangeDesk.convert(euros, RON.class);
        System.out.println(lei);
        dollar = exchangeDesk.convert(lei, USD.class);
        System.out.println(dollar);
        lei = exchangeDesk.convert(dollar, RON.class);
        System.out.println(lei);
        euros = exchangeDesk.convert(lei, EUR.class);
        System.out.println(euros);
        exchangeDesk.addRate(USD.class, RON.class, 5.00);

        // What happen if I change the conversion rate during running?

        System.out.println("Dollar with new conversion rate: ");
        RON lei2 = new RON(1_000);
        USD dollar2 = exchangeDesk.convert(lei2, USD.class);
        System.out.println(dollar2);


        //Output:
//        251.88916876574308 USD
//        204.78794208596997 EUR
//        997.3172779586738 RON
//        251.21342014072388 USD
//        997.3172779586739 RON
//        204.78794208597 EUR
    }
}
