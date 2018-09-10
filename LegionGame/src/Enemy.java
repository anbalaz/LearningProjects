public class Enemy extends GameCharacter {


	String[] kindOfEnemies = { "berzeker", "knight", "paesant", "swordsman", "bowman" };
	String enemyName = kindOfEnemies[RandomNumber.getRnd().nextInt(kindOfEnemies.length)];
	

	public Enemy(int maxHealth, int maxAttack) {
		super(RandomNumber.getRandomMaxHealth(maxHealth), RandomNumber.getRandomMaxAttack(maxAttack));
	}

}
