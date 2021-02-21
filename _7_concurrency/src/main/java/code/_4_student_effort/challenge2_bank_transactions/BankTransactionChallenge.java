package code._4_student_effort.challenge2_bank_transactions;

public class BankTransactionChallenge {

    public static void main(String[] args) throws InterruptedException {

        BankAccount friendAccount = new BankAccount("Ana", 100_000);
        BankAccount myAccount = new BankAccount("Maria", 100);
        System.out.println("before:");
        System.out.println(friendAccount);
        System.out.println(myAccount);

        TransactionThread t1 = new TransactionThread("T1", friendAccount, myAccount, 10);
        TransactionThread t2 = new TransactionThread("T2", friendAccount, myAccount, 100);

        //start transacting
        t1.start();
        t2.start();

        //wait for transfers to be completed
        t1.join();
        t2.join();

        System.out.println("after:");
        System.out.println(friendAccount);
        System.out.println(myAccount);
    }
}
