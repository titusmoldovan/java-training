package code._4_student_effort.ChallengeOne;

public class RON extends Currency {

    public RON() {
    }

    public RON(int amount) {
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
        return super.getAmount() + " RON";
    }

}
