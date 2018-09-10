import java.util.Scanner;

public class Game {

	public void runTheGame() {

		Scanner sc = new Scanner(System.in);
		boolean commandHandled = true;
		String commandString;
		Player player = new Player();
		

		System.out.println(
				"You're in the town that is burning, enemy almost surrounded it, you can either \n1) run away \n2) stay \nWhat do you do?");
		while (commandHandled) {
			commandString = sc.nextLine();
			if (commandString.equals("1")) {
				System.out.println("You coward you run away and probably saved your live from certain death!");
				commandHandled = false;
			} else if (commandString.equals("2")) {
				System.out.println("You decided to stay in the hell now you have to fight for your life!.");
				while (player.getHealth() > 1) {
					Enemy enemy = new Enemy(70, 70);
//					enemy.enemyName;
					System.out.println("The " + enemy.enemyName + " with health " + enemy.getHealth()
							+ " is attacking, you should do something before it is too late");

					System.out.println(
							"You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
					commandString = sc.nextLine();
					if (commandString.equals("1")) {
						System.out.println("You're taken as a prisoner, lets hope somebody will pay ransom for you.");
						System.exit(0);
					}
					if (commandString.equals("2")) {

						while (player.IsAlive() && enemy.IsAlive()) {
							player.setHealth(player.getHealth() - enemy.getAttack());
							enemy.setHealth(enemy.getHealth() - player.getAttack());
							// health = health - enemyAttack;
							// enemyHealth = enemyHealth - attack;

							if (player.getHealth() < 0) {
								player.setHealth(0);
								System.out.println("You're life is " + player.getHealth() + " enemy health is "
										+ enemy.getHealth());
							}else if (enemy.getHealth() < 0) {
								enemy.setHealth(0);
								System.out.println("You're life is " + player.getHealth() + " enemy health is "
										+ enemy.getHealth());
							} else {
								System.out.println("You're life is " + player.getHealth() + " enemy health is "
										+ enemy.getHealth());
							}

							// System.out.println("1)Strike again\n2)Run ");
							// command = sc.nextLine();
							// if (command.equals("1"))
							// if (command.equals("2")) {
							// break;
						}

						if (commandString.equals("1")) {
							commandHandled = false;
						}

					}

				}
			}
		}
		sc.close();
	}
}
