package code._4_student_effort._1_exchangeDesk;

public abstract class Money {
    protected Integer amount;
    public Money(int amount)
    {
        this.amount = amount;
    }
    public void SetAmount(Integer newAmount)
    {
        amount = newAmount;
    }
    public Integer getAmount()
    {
        return amount;
    }
    public abstract String moneyToString();

}
