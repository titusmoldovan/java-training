package code._4_student_effort.challenge1_exchange_desk;

public class ExchangeDeskTest {

    public static void main(String[] args) {

        ExchangeDesk exchangeDesk=new ExchangeDesk();
        Ron lei=new Ron(1000);
        Usd dollar=exchangeDesk.convert(lei, Usd.class,4.1);

    }
}
