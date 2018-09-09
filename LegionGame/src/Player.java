import java.util.Random;

public class Player extends GameCharacter {

	Random rnd = RandomNumber.getRnd();
	
	int playerHealth = 100;
	int maxPlayerAttackDamage = 40;
	
	int healthPotionAmount = 30;
	int healthpotionDropChance = 30;
	int healthPotion = rnd.nextInt(healthPotionAmount);
	int healthpotionDrop = rnd.nextInt(healthpotionDropChance);
	int attack = rnd.nextInt(maxPlayerAttackDamage);
	
	public Player()
	{
		super.setHealth(playerHealth);
		super.setAttackDamage(rnd.nextInt(maxPlayerAttackDamage));
	}

	public void DoSomething()
	{
		int currentHealth = super.health;
		
	}
	
}
