import java.util.ArrayList;
import java.util.Scanner;

public class GameMasso
{

    private Player player;
    private UserInputCommandHandler userInputCommandHandler;
    private ArrayList<Enemy> enemyList;


    public GameMasso(int countOfEnemy)
    {
        this.player = new Player(100000,1000000);
        this.userInputCommandHandler = new UserInputCommandHandler();
        this.enemyList = new ArrayList<Enemy>();

        for (int i = 0; i < countOfEnemy; i++) {
            Enemy enemy = new Enemy(70, 70);
            enemyList.add(enemy);
        }
//        System.out.println("For each");
//        enemyList.forEach((enemy)->{
//            System.out.println(enemy);
//        });
//        System.out.println("Through :");
//        for(Enemy enemy : enemyList){
//            System.out.println(enemy);
//        }
    }

    private void printGameStats()
    {
        System.out.println("You're health is " + player.getHealth());
        for(Enemy enemy : enemyList){
            System.out.println(enemy);
        }
    }

    public void runTheGame()
    {
        Scanner scanner = new Scanner(System.in);
        while(!this.enemyList.isEmpty() && this.player.isAlive())
        {
            this.printGameStats();
            System.out.println("Do you want to fight");
            if(scanner.nextLine().equals("yes"))
            {
                Enemy currentEnemy = this.enemyList.remove(0);
                player.fight(currentEnemy);
                if(currentEnemy.getHealth() > 0)
                {
                    this.enemyList.add(currentEnemy);
                }
            }
            else
            {
                break;
            }
        }

        if(enemyList.isEmpty())
        {
            System.out.println("VICTORY");
        }
        else
        {
            System.out.println("YOU LOOSE");
        }
    }
}
