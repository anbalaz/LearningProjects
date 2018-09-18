
public class Text {
	
	public void takenAsPrisoner() {
		System.out.println("You're taken as a prisoner, lets hope somebody will pay ransom for you.");
	}
	
	public void youAreCoward() {
		System.out.println("You coward you run away and probably saved your live from certain death!");
	}
	
	public void stayAndFight() {
		System.out.println("You decided to stay in the hell now you have to fight for your life!.");
	}
	
	public void initializingGame() {
		System.out.println("You're in the town that is burning, enemy almost surrounded it, you can either \n1) run away \n2) stay \nWhat do you do?");
	}
	
	public void dead() {
		System.out.println("You're dead, you brave man!");
	}
	
	public void fight(int playerHealth, int otherHealth) {
		System.out.println("You're health is " + playerHealth + " enemy health is " + otherHealth);
	}

}
