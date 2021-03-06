package code._4_student_effort.RabbitRace;

public class Main {
    public static void main(String[] args) {
        RabbitThread r1 = new RabbitThread(1);
        RabbitRunnable r2 = new RabbitRunnable(2);
        RabbitThread r3 = new RabbitThread(3);
        RabbitRunnable r4 = new RabbitRunnable(4);
        RabbitThread r5 = new RabbitThread(5);
        RabbitRunnable r6 = new RabbitRunnable(6);
        RabbitThread r7 = new RabbitThread(7);
        RabbitRunnable r8 = new RabbitRunnable(8);
        RabbitThread r9 = new RabbitThread(9);
        RabbitRunnable r10 = new RabbitRunnable(10);

        r1.start();
        new Thread(r2).start();
        r3.start();
        new Thread(r4).start();
        r5.start();
        new Thread(r6).start();
        r7.start();
        new Thread(r8).start();
        r9.start();
        new Thread(r10).start();
    }
}
