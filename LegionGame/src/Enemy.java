public class Enemy extends GameCharacter {


	String[] kindOfEnemies = { "berzeker", "knight", "paesant", "swordsman", "bowman" };
	
	private String enemyName = kindOfEnemies[RandomNumber.getRnd().nextInt(kindOfEnemies.length)];
	

	public String getEnemyName() {
		return enemyName;
	}
	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}


	public Enemy(int maxHealth, int maxAttack) {
		super(maxHealth, maxAttack);
	}
	
//	public Enemy(int maxHealth, int maxAttack) {
//		super(RandomNumber.getRandomMaxHealth(maxHealth), RandomNumber.getRandomMaxAttack(maxAttack));
//	}

}
