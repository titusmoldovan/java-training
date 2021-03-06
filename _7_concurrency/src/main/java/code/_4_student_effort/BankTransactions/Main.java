package code._4_student_effort.BankTransactions;

public class Main {

    public static void main(String[] args) {
        BankAccount from = new BankAccount("BRD",1500);
        BankAccount to = new BankAccount("Raiffaisen", 120);
        TransactionThread transactionThread = new TransactionThread("Transfer",from,to,100);
        transactionThread.start();
    }
}
