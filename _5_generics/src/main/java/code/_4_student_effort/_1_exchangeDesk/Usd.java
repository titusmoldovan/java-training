package code._4_student_effort._1_exchangeDesk;

public class Usd extends Money{
    public Usd(Integer amount)
    {
        super(amount);
    }

    @Override
    public String moneyToString() {
        return amount.toString() + "dollars";
    }
}
