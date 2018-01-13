import java.util.Scanner;

public class App_TextGame {
	public static void main(String[] args) {

		boolean commandHandled = false;
		Scanner sc = new Scanner(System.in);
		String command = TextResources.room1description;
		String FirstRoomDescription= TextResources.room1description;

		
		System.out.println(FirstRoomDescription);
		
		while(!commandHandled) {
			command= sc.nextLine();
			if (command.equals("y")){
				System.out.println("You're in the room with two doors which door do you enter left or right?");
				commandHandled = true;
				}
			if (command.equals("n")) {
				System.out.println("You die by starving, because you are coward");
				//return;
				System.exit(0);
			}
			
		}
					
		System.out.println("Hello");
		
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
			if (command.equals("stay")) {
				System.out.println("You die by starving");
			}
		}



	}
}
