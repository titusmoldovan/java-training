package code._4_student_effort.challenge1_rabit_race;

public class RabbitRaceChallenge {

    public Thread createRabbitThread(int nr) {
        return new RabbitThread(nr);
    }

    public Thread creatRabbitRunnable(int nr) {
        Runnable rabbitRunnable = new RabbitRunnable(nr);
        return new Thread(rabbitRunnable);
    }

    public Thread getCorrespondingRabbitThreadImpl(int startPosition) {
        return (startPosition % 2 == 0) ? createRabbitThread(startPosition) : creatRabbitRunnable(startPosition);
    }

    public void runRabbit(Thread rabbit) {
        rabbit.start();
    }

    public void race() {
        for (int i = 0; i < 10; i++) {
            Thread rabbit = getCorrespondingRabbitThreadImpl(i);
            runRabbit(rabbit);
        }
    }

    public static void main(String[] args) {
        RabbitRaceChallenge challenge = new RabbitRaceChallenge();
        challenge.race();
    }
}
