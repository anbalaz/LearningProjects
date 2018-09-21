
public final class Player extends GameCharacter {

    private static String playerName;

    private  static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String name) {
        playerName = name;
    }

    @Override
    protected  String getName() {
        return getPlayerName();
    }
    //	int healthPotionAmount = 30;
//	int healthpotionDropChance = 30;
//	int healthPotion = rnd.nextInt(healthPotionAmount);
//	int healthpotionDrop = rnd.nextInt(healthpotionDropChance);
//	int attack = rnd.nextInt(maxPlayerAttackDamage);

//	public Player()
//	{
//		super.setMaxHealth(100);
//		super.setMaxAttack(50);
//		super.setHealth(getMaxHealth());
//		super.setAttack(rnd.nextInt(getMaxAttack()));
//	}


    //	public void DoSomething()
//	{
//		int currentHealth = super.health;
//
//	}

    }


