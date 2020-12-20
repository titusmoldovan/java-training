package code._4_student_effort.ChallengeOne;

public class EUR extends Currency {

    public EUR() {
    }

    public EUR(int amount) {
        super(amount);
    }

    @Override
    public void setAmount(double amount) {
        super.setAmount(amount);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public String toString() {
        return super.getAmount() + " EUR";
    }
}
