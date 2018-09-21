import java.util.ArrayList;

public class Game {

    Player player;
    UserInputCommandHandler userInputCommandHandler;

    public Game(int countOfEnemy) {
        this.player = new Player();
        this.userInputCommandHandler = new UserInputCommandHandler();

        ArrayList<Enemy> enemyList = new ArrayList<>();
        for (int i = 0; i < countOfEnemy; i++) {
            Enemy enemy = new Enemy(70, 70);
            enemyList.add(enemy);
        }
        System.out.println("For each");
        enemyList.forEach((enemy)->{
            System.out.println(enemy);
        });
        System.out.println("Through :");
        for(Enemy enemy : enemyList){
            System.out.println(enemy);
        }

    }

//    public void runTheGame() {
//
////		public void initialize(){
//        //TODO typicka inicializacia co ma byt v konstruktore
//
//
//        Text.initializingGame();
//        loopGame:
//        while (userInputCommandHandler.isCommandHandled()) {
//            userInputCommandHandler.readCommandString();
//            // TODO: prerob string na int
//            if (userInputCommandHandler.equals("1")) {
//                this.runningAwayCmd();
//            } else if (userInputCommandHandler.equals("2")) {
//                this.fightOrSurrenderCmd();
//                while (player.getHealth() > 1) {
//                    if (userInputCommandHandler.equals("1")) {
//                        this.surrenderCmd();
//                        break;
//                    } else if (userInputCommandHandler.equals("2")) {
//                        while (player.IsAlive() && enemy.IsAlive()) {
//                            player.fight(enemy);
//                            System.out.println(player.healthToString() + ", " + enemy.healthToString());
////                            System.out.println("You're health is " + player.getHealth() + " enemy health is " + enemy.getHealth());
//                        }
//                        // System.out.println("1)Strike again\n2)Run ");
//                        // command = sc.nextLine();
//                        // if (command.equals("1"))
//                        // if (command.equals("2")) {
//                        // break;
//                    }
//                    Text.dead();
//                    break;
//                }
//            }
//        }
//
//    }
//
//    protected void runningAwayCmd() {
//        Text.youAreCoward();
//        this.userInputCommandHandler.setCommandHandled(false);
//    }
//
//    protected void fightOrSurrenderCmd() {
//        Text.stayAndFight();
//        Enemy enemy = new Enemy(70, 70);
//        System.out.println("The " + enemy.getEnemyName() + " with health " + enemy.getHealth()
//                + " is attacking, you should do something before it is too late");
//        System.out.println(
//                "You' re health is " + player.getHealth() + ". What do you do \n1) surrender \n2) fight");
//        userInputCommandHandler.readCommandString();
//    }
//
//    protected void surrenderCmd() {
//        Text.takenAsPrisoner();
//    }
}