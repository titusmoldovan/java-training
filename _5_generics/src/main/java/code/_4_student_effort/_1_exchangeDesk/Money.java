package code._4_student_effort._1_exchangeDesk;

public abstract class Money {
    protected Double amount;
    public Money(){

    }
    public Money(Double amount)
    {
        this.amount = amount;
    }
    public void setAmount(Double newAmount)
    {
        amount = newAmount;
    }
    public Double getAmount()
    {
        return amount;
    }
    public abstract String moneyToString();

}
