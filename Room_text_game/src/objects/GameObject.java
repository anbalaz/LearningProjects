package objects;

public class GameObject {
    private String objectName;
    private boolean pickUp;
    private boolean breakSmth;


    public  GameObject(String objectName,boolean pickUp,boolean breakSmth){
        this.objectName=objectName;
        this.pickUp=pickUp;
        this.breakSmth=breakSmth;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "objectName='" + objectName + '\'' +
                ", pickUp=" + pickUp +
                ", breakSmth=" + breakSmth +
                '}';
    }
}
