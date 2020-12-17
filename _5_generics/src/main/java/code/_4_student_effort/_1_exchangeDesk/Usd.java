package code._4_student_effort._1_exchangeDesk;

public class Usd extends Money{
    public Usd(){

    }
    public Usd(Double amount)
    {
        super(amount);
    }

    @Override
    public String moneyToString() {
        return amount + " dollars";
    }
}
