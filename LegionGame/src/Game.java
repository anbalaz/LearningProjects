import java.util.Scanner;

public class Game {
	
	public void runTheGame() {
		
		Scanner sc= new Scanner(System.in);
		boolean commandHandled= true;
		String commandString;
		Player player= new Player();
		Enemy enemy= new Enemy();
		
		System.out.println(
				"You're in the town that is burning, enemy almost surrounded it, you can either \n1) run away \n2) stay \nWhat do you do?");
		while (commandHandled) {
			commandString = sc.nextLine();
			if (commandString.equals("1")) {
				System.out.println("You coward you run away and probably saved your live from certain death!");
				commandHandled = false;
			}
			else if(commandString.equals("2")){
				System.out.println("You decided to stay in the hell now you have to fight for your life!.");
				while (player.getHealth() > 1) {
					
										System.out.println("The " + enemy.enemyName + " with health " + enemy.getHealth()
												+ " is attacking, you should do something before it is too late");
					
										System.out.println("You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
										commandString = sc.nextLine();
										if (commandString.equals("1")) {
											System.out.println("You're taken as a prisoner, lets hope somebody will pay ransom for you.");
											System.exit(0);
										}
										if (commandString.equals("2")) {
					
											while (player.getHealth() > 1 && enemy.getHealth() > 1) {
												player.getAttack();
												enemy.getAttackDamage();
//			neni doriesene																					
//												int i= player.getHealth()- enemy.getAttackDamage();
//												int e= enemy.getHealth()-player.getAttackDamage();
//												player.getHealth(i);
//												enemy.getHealth(e);
//												health = health - enemyAttack;
//												enemyHealth = enemyHealth - attack;
					
												if (player.getHealth() < 0) {
//			neni doriesene											
													player.getHealth();
													System.out.println("You're life is " + player.getHealth() + " enemy health is " + enemy.getHealth());
												} else if (enemy.getHealth() < 0) {
//			neni doriesene										
													enemy.getHealth();
													System.out.println("You're life is " + player.getHealth() + " enemy health is " + enemy.getHealth());
												} else {
													System.out.println("You're life is " + player.getHealth() + " enemy health is " + enemy.getHealth());
												}
					
//												System.out.println("1)Strike again\n2)Run ");
//												command = sc.nextLine();
//												if (command.equals("1"))
//												if (command.equals("2")) {
//													break;
			}
		
			
			if(commandString.equals("1")){
				commandHandled= false;
			}
			
		}
		
	}
			}
		}
	}
}
			
	
