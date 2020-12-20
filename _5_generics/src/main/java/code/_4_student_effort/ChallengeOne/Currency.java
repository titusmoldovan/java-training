package code._4_student_effort.ChallengeOne;

public abstract class Currency {
    private double amount;

    public Currency() {
    }

    public Currency(int amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
