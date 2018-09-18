public class Enemy extends GameCharacter {


    String[] kindOfEnemies = { "berzeker", "knight", "paesant", "swordsman", "bowman" };

    private String enemyName = kindOfEnemies[RandomNumber.getRnd().nextInt(kindOfEnemies.length)];

    public void setEnemyName(String enemyName)
    {
        this.enemyName = enemyName;
    }

    public String getEnemyName()
    {
        return enemyName;
    }

    public Enemy(int maxHealth, int maxAttack)
    {
        super(maxHealth, maxAttack);
    }


    @Override
    protected String getName() {
        return getEnemyName();
    }

//	public Enemy(int maxHealth, int maxAttack) {
//		super(RandomNumber.getRandomMaxHealth(maxHealth), RandomNumber.getRandomMaxAttack(maxAttack));
//	}

}