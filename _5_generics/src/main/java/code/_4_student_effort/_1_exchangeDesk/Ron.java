package code._4_student_effort._1_exchangeDesk;

public class Ron implements Money{
    private Integer value;
    public Ron(int value)
    {
        this.value = value;
    }

    @Override
    public void setValue(Integer newValue) {
        this.value = newValue;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String moneyToString() {
        String output;
        output = value.toString() + "lei";
        return output;
    }
}
