package BehavioralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher {

    //Bütün actor'leri uzman oldugu topic ile setmelemek lazim
    Map<String, Actor> registeredActors = new HashMap<>();

    //actor'leri kaydeden metod
    void register(String topic, Actor actor) {
        registeredActors.put(topic, actor);
    }

    @Override
    public void dispatch(String topic, String message) {

        //topic ile ilgili actor (uzmani) cagiriyoruz
        Actor actor = registeredActors.get(topic);

        if (actor == null) {

            System.out.println("No actor registerede for this topic");

        } else {

            actor.receiveMessage(message);

        }

    }
}
