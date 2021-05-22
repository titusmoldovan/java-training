import java.util.Random;
public class RandomNumber {

    int getRandomNumber() {
        Random rand = new Random();
        int upperBound = 10;
        int randomNumber = rand.nextInt(upperBound);
        return randomNumber;
    }
}
