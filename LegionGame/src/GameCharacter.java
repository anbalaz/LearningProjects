public abstract class GameCharacter {
	
	protected int health;
	protected int maxHealth;
	protected int maxAttack;
	protected int attack;
	
	public boolean IsAlive() {
		return this.getHealth() > 0;
	}

	public int getHealth() {
		if (this.health < 0) {
			return 0;
		}
		return health;
	}
	
	public void fight(int attackStrength) {
		setHealth(getHealth()-attackStrength);
	}
	
	public void fight(GameCharacter otherCharacter) {
		this.fight(otherCharacter.getAttack());
		otherCharacter.fight(this.getAttack());
	}
	
	public void setMaxRandomAttack() {
		this.setAttack(RandomNumber.getRandomMaxHealth(this.getMaxAttack()));
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
