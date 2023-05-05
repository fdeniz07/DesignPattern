package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "Merhaba";

    private SingletonObject() {
    }

    ;

    private static SingletonObject instance = new SingletonObject();

    public static SingletonObject getInstance() {
        return instance;
    }

    public void changeMessage() {
        this.message = this.message + " Batch 130";
        System.out.println(this.message);
    }
}
