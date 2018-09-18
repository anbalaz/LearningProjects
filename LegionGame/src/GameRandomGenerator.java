import java.util.Random;

public class GameRandomGenerator {

    public static Random randomGenerator = new Random();

    public static int NextInt()
    {
        randomGenerator = new Random();
        Random rnd = randomGenerator;
        rnd = new Random();
        return randomGenerator.nextInt();
    }

}
