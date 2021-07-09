public class RabbitRunnable implements Runnable {
    private final int nr;

    public RabbitRunnable(int nr) {
        this.nr = nr;
    }

    public void run() {
        System.out.println("Rabbit no " + nr + " is running.");
    }
}
