
public class Game {

	public void runTheGame() {

		Player player = new Player();
		Environment environment= new Environment();
		environment.setCommandHandled(true);

		System.out.println(
				"You're in the town that is burning, enemy almost surrounded it, you can either \n1) run away \n2) stay \nWhat do you do?");
		while (environment.isCommandHandled()) {
			environment.insertedText();
			if (environment.getCommandString().equals("1")) {
				System.out.println("You coward you run away and probably saved your live from certain death!");
				environment.setCommandHandled(false);
			} else if (environment.getCommandString().equals("2")) {
				System.out.println("You decided to stay in the hell now you have to fight for your life!.");
				while (player.getHealth() > 1) {
					Enemy enemy = new Enemy(70,70);
					System.out.println("The " + enemy.getEnemyName() + " with health " + enemy.getHealth()
							+ " is attacking, you should do something before it is too late");
					System.out.println(
							"You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
					environment.insertedText();
					if (environment.getCommandString().equals("1")) {
						System.out.println("You're taken as a prisoner, lets hope somebody will pay ransom for you.");
						break;
					}
					else if (environment.getCommandString().equals("2")) {

						while (player.IsAlive() && enemy.IsAlive()) {
							player.fight(enemy);

							System.out.println(
									"You're life is " + player.getHealth() + " enemy health is " + enemy.getHealth());
						}

						// System.out.println("1)Strike again\n2)Run ");
						// command = sc.nextLine();
						// if (command.equals("1"))
						// if (command.equals("2")) {
						// break;
					}

				}
				System.out.println("You're dead, you brave man!");
				break;

			}
		}
	}

}

