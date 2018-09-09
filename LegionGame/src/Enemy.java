import java.util.Random;

public class Enemy extends GameCharacter {

	Random rnd = RandomNumber.getRnd();

	String[] kindOfEnemies = { "berzeker", "knight", "paesant", "swordsman", "bowman" };
	int maxEnemyHealth = 50;
	int maxEnemyAttackDamage = 50;
	int enemyHealth = rnd.nextInt(maxEnemyHealth);
	int enemyAttack = rnd.nextInt(maxEnemyAttackDamage);
	String enemyName= kindOfEnemies[rnd.nextInt(kindOfEnemies.length)];
	
	public Enemy(){
		
		super.setHealth(rnd.nextInt(maxEnemyHealth));
		super.setAttack(rnd.nextInt(maxEnemyAttackDamage));
		this. enemyName= enemyName;
	}

}
