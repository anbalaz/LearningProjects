import java.util.Scanner;

public class App_TextGame {
	public static void main(String[] args) {

		boolean commandHandled = false;
		Scanner sc = new Scanner(System.in);

		String command;
		String room1Intro = TextResources.room1intro;
		String room1Description = TextResources.room1Description;
		String deathByStarve = TextResources.deathByStarving;
		String survive = TextResources.winnnig;
		String deathByWrongDoor = TextResources.loose;

		System.out.println(room1Intro);

		while (!commandHandled) {

			command = sc.nextLine();

			if (command.equals("y")) {

				System.out.println(room1Description);

				while (!commandHandled) {

					command = sc.nextLine();

					if (command.equals("left")) {
						System.out.println(room1Description);

						while (!commandHandled) {

							command = sc.nextLine();

							if (command.equals("left")) {
								System.out.println(survive);
								System.exit(0);

							}
							if (command.equals("right")) {
								System.out.println(deathByWrongDoor);
								System.exit(0);

							}
							if (command.equals("stay")) {
								System.out.println(deathByStarve);
								System.exit(0);
							}
						}

					}
					if (command.equals("right")) {
						System.out.println(room1Description);

						while (!commandHandled) {

							command = sc.nextLine();

							if (command.equals("left")) {
								System.out.println(deathByWrongDoor);
								System.exit(0);

							}
							if (command.equals("right")) {
								System.out.println(deathByWrongDoor);
								System.exit(0);

							}
							if (command.equals("stay")) {
								System.out.println(deathByStarve);
								System.exit(0);
							}
						}

					}
					if (command.equals("stay")) {
						System.out.println(deathByStarve);

						System.exit(0);
					}
				}

				// commandHandled = true;
			}

			if (command.equals("n")) {
				System.out.println(deathByStarve);
				// return;
				System.exit(0);
			}

		}

	}
}
