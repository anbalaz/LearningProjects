import java.util.Random;
import java.util.Scanner;

public class App_1 {
	public static void main(String[] args) {

		// System parameters

		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		String command;
		boolean commandHandled = true;

		// World parameters

		int maxEnemyHealth = 50;
		int enemyAttackdamage = 50;

		String[] enemies = { "berzeker", "knight", "paesant" };

		String[] events = { "stone from trebuchet is falling to the place where you are standing",
				"arrow from crossbow was fired into your directions", "building crumbels next to you" };

		int health = 100;
		int attackDamage = 40;
		int healthPotionAmount = 30;
		int healthpotionDropChance = 30;
		
//		creasing and decreasing numbers
		
		String enemy= enemies[rnd.nextInt(enemies.length)];
		int enemyHealth= rnd.nextInt(maxEnemyHealth);
		int enemyAttack= rnd.nextInt(attackDamage);
		int attack= rnd.nextInt(attackDamage);
		int healthPotion= rnd.nextInt(healthPotionAmount);
		int healthpotionDrop= rnd.nextInt(healthpotionDropChance);
				
//		Main game, beginning

		System.out.println(
				"You're in the town that is burning, enemy almost surrounded it, you can either \n1)run away or \n2)stay. \nWhat do you do?");

		while (commandHandled) {

			command = in.nextLine();
			if (command.equals("1")) {
				System.out.println("You coward you run away and probably save your live from certain death!");
				commandHandled = false;
			}
			if (command.equals("2")) {
				
				System.out.println("You're brave but also dead.");
				System.exit(0);

			}
		}
	}

}