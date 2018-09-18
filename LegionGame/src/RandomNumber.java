import java.util.Random;

public class RandomNumber {

    private static final Random rnd = new Random();

//    public  RandomNumber() {
//    }

    public static Random getRnd() {
        return rnd;
    }

    public static int getRandomMaxAttack(int maxAttack)
    {
        return rnd.nextInt(maxAttack);
    }
    public static int getRandomMaxHealth(int maxHealth) {
        return rnd.nextInt(maxHealth)+1;
    }


}
