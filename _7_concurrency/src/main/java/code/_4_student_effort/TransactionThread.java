public class TransactionThread extends Thread {
    private final String name;
    private final BankAccount from;
    private final BankAccount to;
    private final int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("Transaction in process...");
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.withdraw(amount) && to.deposit(amount)) {
            System.out.println(amount+" transferred "+"to "+to.getName());
        } else
            System.out.println("Impossible to deliver "+amount+" to "+to.getName());
    }
}
