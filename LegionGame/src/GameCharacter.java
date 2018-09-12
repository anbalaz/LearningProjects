public abstract class GameCharacter {
	
	private int health;
	private int maxHealth;
	private int maxAttack;
	private int attack;
	
	public boolean IsAlive() {
		return this.getHealth() > 0;
	}

	public int getHealth() {
		if (this.health < 0) {
			return 0;
		}
		return health;
	}
	
	private void setMaxRandomAttack(int maxAttackStrength) {
		this.setAttack(RandomNumber.getRandomMaxAttack(maxAttackStrength));
	}
	
	private void setMaxRandomAttack(GameCharacter otherCharacter) {
		this.setMaxRandomAttack(this.getMaxAttack());
		otherCharacter.setMaxRandomAttack(otherCharacter.getMaxAttack());
	}
	
	private void healthCounting(int attackStrength) {
		this.setHealth(this.getHealth()-attackStrength);
	}
	
	private void healthCounting(GameCharacter otherCharacter) {
		this.healthCounting(otherCharacter.getAttack());
		otherCharacter.healthCounting(this.getAttack());
	}
	
	public void fight(GameCharacter otherCharacter) {
		this.healthCounting(otherCharacter);
		this.setMaxRandomAttack(otherCharacter);
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public  int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getMaxAttack() {
		return maxAttack;
	}
	
	private void setMaxAttack(int maxAttack) {
		this.maxAttack = maxAttack;
	}
	
	public GameCharacter() {
		this.setMaxHealth(100);
		this.setMaxAttack(50);
		this.setHealth(100);
		this.setAttack(RandomNumber.getRandomMaxAttack(getMaxAttack()));
	}
	
	public GameCharacter(int maxHealth, int maxAttack)
	{
		this.setMaxHealth(maxHealth);
		this.setMaxAttack(maxAttack);
		this.setAttack(RandomNumber.getRandomMaxHealth(getMaxAttack()));
		this.setHealth(RandomNumber.getRandomMaxHealth(getMaxHealth()));
	}
}
