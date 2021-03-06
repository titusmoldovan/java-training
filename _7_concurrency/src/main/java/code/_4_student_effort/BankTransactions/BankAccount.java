package code._4_student_effort.BankTransactions;

public class BankAccount {
    private String name;
    private int debit;
    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    void withdraw(double amount) {
        longDatabaseCall();
        debit -=amount;
        System.out.println("Account "+name+ " was withdrawn with "+amount);

    }

    void deposit(double amount) {
        longDatabaseCall();
        debit +=amount;
        System.out.println("Account "+name+ " was deposited with "+amount);

    }

    void longDatabaseCall() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getDebit() {
        return debit;
    }
}
