package code._4_student_effort._1_exchangeDesk;

public class MainDesk {
    public static void main(String args[])
    {
        ExchangeDesk exchangeDesk= new ExchangeDesk();
        Ron sumaRon = new Ron(100.0);
        Usd sumaUsd = exchangeDesk.convert(sumaRon,Usd.class,4.5);
        System.out.println(sumaUsd.moneyToString());
    }
}
