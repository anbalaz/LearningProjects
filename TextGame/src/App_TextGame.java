import java.util.Scanner;

public class App_TextGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String command = TextResources.room1description;

		// System.out.println("You're in some kind of room, you're head is exploding
		// from pain.\nIt is possible that you are blind. Do you wanna try to open your
		// eyes? y/n");

		System.out.println("You're in the room with two doors which door do you enter left or right?");
		boolean commandHandled = false;
		
		while (!commandHandled) {
			command = sc.next();
			if (command.equals("right")) {
				System.out.println("bllaaaa");
				commandHandled = true;
			}
			if (command.equals("left")) {
				System.out.println("blleeee");
				commandHandled = true;
			}
		}

		// do {

		String swedrftgyh = TextResources.room1description;
		// }

	}
}
