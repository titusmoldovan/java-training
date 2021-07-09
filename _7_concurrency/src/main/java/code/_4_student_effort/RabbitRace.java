public class RabbitRace {

    public static void main(String[] args) {

        RabbitThread rabbitT[] = new RabbitThread[5];
        RabbitRunnable rabbitR[] = new RabbitRunnable[5];

        for (int i = 0; i < 5; i++) {
            rabbitT[i] = new RabbitThread(i + 1);
            rabbitR[i] = new RabbitRunnable(i + 6);
        }
         /* I CREATE AN ARRAY OF THREADS WHERE I STORE
         BOTH RABBIT THREAD(ON EVEN POSITIONS)
         AND RABBIT RUNNABLE(ON ODD POSITIONS)
         -------------------------------------
         INDEX 0 IS CONSIDERED 1ST POSITION
         */
        Thread[] t = new Thread[10];
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0)
                t[i] = rabbitT[i / 2];
            else
                t[i] = new Thread(rabbitR[i / 2]);
            t[i].start();
            try {
                t[i].join();
            } catch (Exception e) {
                System.out.println("Interrupted Exception!");
            }
        }
    }
}

