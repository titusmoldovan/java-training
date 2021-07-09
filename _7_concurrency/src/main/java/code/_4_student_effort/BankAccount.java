public class BankAccount {
    private final String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public String getName() {
        return name;
    }

    protected synchronized boolean withdraw(int amount) {
        longDatabaseCall();
        if (amount <= this.debit) {
            this.debit = this.debit - amount;
            return true;
        } else
            return false;
    }

    protected synchronized boolean deposit(int amount) {
        longDatabaseCall();
        if (amount > 0) {
            this.debit = this.debit + amount;
            return true;
        } else return false;
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Mihai Popescu", 1500);
        BankAccount b2 = new BankAccount("Raluca Miron", 6700);
        BankAccount b3 = new BankAccount("Daria Florea", 5600);

        TransactionThread t1 = new TransactionThread("Plata chirie", b2, b1, 6700);
        TransactionThread t2 = new TransactionThread("Cadou", b2, b3, 6700);
        TransactionThread t3 = new TransactionThread("Servicii", b3, b2, 60);

        t1.start();
        t2.start();
        t3.start();

    }
}
