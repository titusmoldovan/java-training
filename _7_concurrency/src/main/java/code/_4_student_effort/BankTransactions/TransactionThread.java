package code._4_student_effort.BankTransactions;

public class TransactionThread extends Thread{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
       this.name = name;
       this.from = from;
       this.to = to;
       this.amount = amount;
    }

    @Override
    public void run() {
       transfer(from,to,amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println(from.getName()+" current debit is = "+from.getDebit());
        System.out.println(to.getName()+" current debit is = "+to.getDebit());
    }

}
