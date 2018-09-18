import java.util.Scanner;

public class Environment {
		
	private String commandString;
	private boolean commandHandled = true;
	private Scanner scanner = new Scanner(System.in);
	
	public void insertedText() {
		this.setCommandString(this.scanner.nextLine());
		}
	
	public boolean equals(String answer) {
		if (this.getCommandString().equals(answer)) {
			return true;
		}
		return false;
	}
	
	private String getCommandString() {
		return commandString;
	}
	private void setCommandString(String commandString) {
		this.commandString = commandString;
	}
	public boolean isCommandHandled() {
		return commandHandled;
	}
	public void setCommandHandled(boolean commandHandled) {
		this.commandHandled = commandHandled;
	}
	public Scanner getIn() {
		return scanner;
	}
	public void setIn(Scanner in) {
		this.scanner = in;
	}
	
	

}