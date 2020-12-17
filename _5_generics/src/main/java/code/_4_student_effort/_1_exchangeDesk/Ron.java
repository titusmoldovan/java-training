package code._4_student_effort._1_exchangeDesk;

public class Ron extends Money{
    public Ron(){}

    public Ron(Double value)
    {
        super(value);
    }
    @Override
    public String moneyToString() {
        return amount + " lei";
    }
}
