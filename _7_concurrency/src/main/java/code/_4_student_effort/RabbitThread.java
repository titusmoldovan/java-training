public class RabbitThread extends Thread {
    private final int nr;

    public RabbitThread(int nr) {
        this.nr = nr;
    }

    public void run() {
        System.out.println("Rabbit no " + nr + " is running.");
    }
}
