public class Game {

	public void runTheGame() {

//		public void initialize(){
			Player player = new Player();
			Environment environment= new Environment();
			environment.setCommandHandled(true);
			Text text= new Text();
//								}

		text.initializingGame();
		while (environment.isCommandHandled()) {
			environment.insertedText();
			if (environment.equals("1")) {
				text.youAreCoward();
				environment.setCommandHandled(false);
			} else if (environment.equals("2")) {
				text.stayAndFight();
				while (player.getHealth() > 1) {
					Enemy enemy = new Enemy(70, 70);
					System.out.println("The " + enemy.getEnemyName() + " with health " + enemy.getHealth()
							+ " is attacking, you should do something before it is too late");
					System.out.println(
							"You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
					environment.insertedText();
					if (environment.equals("1")) {
						text.takenAsPrisoner();
						break;
					} else if (environment.equals("2")) {
						while (player.IsAlive() && enemy.IsAlive()) {
							player.fight(enemy);
							System.out.println( player.healthToString()+", "+enemy.healthToString());
//									"You're health is " + player.getHealth() + " enemy health is " + enemy.getHealth());
						}
						// System.out.println("1)Strike again\n2)Run ");
						// command = sc.nextLine();
						// if (command.equals("1"))
						// if (command.equals("2")) {
						// break;
					}
				}
				text.dead();
				break;
			}
		}
	}

}

