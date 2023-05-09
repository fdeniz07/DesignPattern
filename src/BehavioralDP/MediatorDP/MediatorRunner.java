package BehavioralDP.MediatorDP;

public class MediatorRunner {

    void mediatorDemo(){

        //Danisman objemizi olusturuyoruz
        MessageDispatcher dispatcher = new MessageDispatcher();

        //actor'lerimizi olusturuyoruz
        Actor actor1 = new MessageActor("Actor 1",dispatcher);
        Actor actor2 = new MessageActor("Actor 2",dispatcher);
        Actor actor3 = new MessageActor("Actor 3",dispatcher);
        Actor actor4 = new MessageActor("Actor 4",dispatcher);

        //dispatcher üzerinden hangi actor hangi alanda uzman onu setliyoruz.
        dispatcher.register("Topic1",actor1);
        dispatcher.register("Topic2",actor2);
        dispatcher.register("Topic3",actor3);
        dispatcher.register("Topic4",actor4);

        //actor'lerin sordugu sorular
        actor1.sendMessage("Topic2","Message for Topic2"); //actor2 karsilayacak
        actor1.sendMessage("Topic3","Message for Topic3"); //actor3 karsilayacak
        actor1.sendMessage("Topic4","Message for Topic4"); //actor4 karsilayacak

        //actor'lerin sordugu sorular
        actor2.sendMessage("Topic1","Message for Topic1"); //actor1 karsilayacak
        actor2.sendMessage("Topic5","Message for Topic5"); //uyari mesaji

    }

    public static void main(String[] args) {

        MediatorRunner mediator = new MediatorRunner();
        mediator.mediatorDemo();

    }
}
