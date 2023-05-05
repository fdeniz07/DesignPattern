package CreationalDP.SingletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {

//        SingletonObject object1 = new SingletonObject();
//        SingletonObject object2 = new SingletonObject();

        //SingletonObject obj = new SingletonObject();

        SingletonObject obj1 = SingletonObject.getInstance();
        System.out.println(obj1.message); //Merhaba
        obj1.changeMessage(); //obj1 --> message = "Merhaba Batch 130"


        //2.Obje yi üretiyoruz
        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println(obj2.message);

    }
}
