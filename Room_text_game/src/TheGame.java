import objects.GameObject;

public class TheGame {

    public void runTheGame(){
        System.out.println("The game is running");
        GameObject object= new GameObject("hovno",true,true);
        System.out.println(object.toString());

    }
}

