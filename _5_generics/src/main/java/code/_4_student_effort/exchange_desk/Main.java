package code._4_student_effort.exchange_desk;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        exchangeDesk.addRate(RON.class, USD.class, 4.1);
        RON lei = new RON(1000);
        USD dollar = exchangeDesk.convert(lei, USD.class);
        System.out.println(dollar);
        dollar = new USD(1000);
        lei = exchangeDesk.convert(dollar, RON.class);
        System.out.println(lei);
    }
}
