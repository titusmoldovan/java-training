package code._4_student_effort._1_exchangeDesk;

public class Ron extends Money{

    public Ron(Integer value)
    {
        super(value);
    }
    @Override
    public String moneyToString() {
        return amount.toString() + "lei";
    }
}
