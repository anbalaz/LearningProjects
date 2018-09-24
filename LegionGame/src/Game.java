import java.util.ArrayList;

public class Game {

    public Player player;
    public ArrayList<Enemy> enemyList;

    public Game(int countOfEnemy) {
        this.player = new Player();
        this.enemyList = new ArrayList<>();

        for (int i = 0; i < countOfEnemy; i++) {
            Enemy enemy = new Enemy(30, 30);
            enemyList.add(enemy);
        }

//        System.out.println("For each");
//        enemyList.forEach((enemy)->{
//            System.out.println(enemy);
//        });
    }

    public void printAliveEnemy() {

        for (Enemy enemy : enemyList) {
            System.out.println(enemy);
        }
    }

    public void runTheGame() {

//		public void initialize(){
        //TODO typicka inicializacia co ma byt v konstruktore


        Text.initializingGame();
        while (UserInputCommandHandler.isCommandHandled()) {
            UserInputCommandHandler.readCommandString();
            // TODO: prerob string na int
            if (UserInputCommandHandler.equals("1")) {
                this.runningAwayCmd();
                break;
            } else if (UserInputCommandHandler.equals("2")) {
                while (player.getHealth() > 1 && !enemyList.isEmpty()) {

                    Text.stayAndFight();

                    this.printAliveEnemy();

                    System.out.println("The " + this.enemyList.get(0).getEnemyName() + " with health " + this.enemyList.get(0).getHealth()
                            + " is attacking, you should do something before it is too late");
                    System.out.println(
                            "You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
                    UserInputCommandHandler.readCommandString();

                    if (UserInputCommandHandler.equals("1")) {
                        this.surrenderCmd();
                        break;
                    } else if (UserInputCommandHandler.equals("2")) {
                        while (player.isAlive() && enemyList.get(0).isAlive()) {
                            player.fight(enemyList.get(0));
                            System.out.println(player.healthToString() + ", " + enemyList.get(0).healthToString());
                            if (!enemyList.get(0).isAlive()) {
                                enemyList.remove(0);
                                break;
                            }
                        }

                    }

                }
                if (enemyList.isEmpty() || player.getHealth() > 1) {
                    System.out.println("You won,there is no one to fight, now run away you fool!");
                    break;
                } else if (player.getHealth() < 1){
                    Text.dead();
                    break;
                }
                else{
                    break;
                }

            }
        }

    }

    protected void runningAwayCmd() {
        Text.youAreCoward();
        UserInputCommandHandler.setCommandHandled(false);
    }

    protected void fightOrSurrenderCmd() {
        Text.stayAndFight();
        Enemy enemy = new Enemy(70, 70);
        System.out.println("The " + enemy.getEnemyName() + " with health " + enemy.getHealth()
                + " is attacking, you should do something before it is too late");
        System.out.println(
                "You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
        UserInputCommandHandler.readCommandString();
    }

    protected void surrenderCmd() {
        Text.takenAsPrisoner();
    }
}