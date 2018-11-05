package gameParts;

import java.util.Random;

public class RandomNumber {

    static private Random random = new Random();

    protected static int generateRandomNumber() {

        return random.nextInt(25) + 1;
    }
}
