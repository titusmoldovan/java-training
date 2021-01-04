package code._4_student_effort.Exchange_Desk;

import code._2_challenge._1_exchange_desk.ExchangeDeskConversionException;

class exchangeDesk{

    <FirstCurrency extends Currency, SecondCurrency extends Currency> FirstCurrency convert(SecondCurrency exchangedCurrency, Class<FirstCurrency> changeClass, double rateOfConversion){
        FirstCurrency changedCurrency = null;
        try{
            changedCurrency = changeClass.getDeclaredConstructor().newInstance();
            changedCurrency.setMoney(exchangedCurrency.getMoney() * rateOfConversion);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return changedCurrency;
    }

}

class RON extends Currency{

    public RON() {
    }

    public RON(double lei){
        super(lei);
    }

    public double getLei(){
        return super.getMoney();
    }

}

class USD extends Currency{

    public USD() {
    }

    public USD(double dollars){
        super(dollars);
    }

    public double getDollars(){
        return super.getMoney();
    }

}

class Currency{
    private double money;

    public Currency() {
    }

    public Currency(double money){
        this.money = money;
    }

    public double getMoney(){
        return this.money;
    }

    public void setMoney(double money){
        this.money = money;
    }

    @Override
    public String toString() {
        return " " + money;
    }
}

public class Exchange_Desk {
    public static void main(String[] args) {
        exchangeDesk exchangeDesk = new exchangeDesk();
        RON lei = new RON(1_000);
        USD dollars = exchangeDesk.convert(lei, USD.class, 0.25169);
        System.out.println("Dollars:" + dollars);
    }
}
