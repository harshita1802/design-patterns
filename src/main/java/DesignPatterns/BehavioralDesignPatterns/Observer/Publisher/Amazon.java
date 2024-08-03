package DesignPatterns.BehavioralDesignPatterns.Observer.Publisher;

import DesignPatterns.BehavioralDesignPatterns.Observer.Subscribers.OrderPlacedEventSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static Amazon instance;
    private List<OrderPlacedEventSubscriber> subscribers;

    private Amazon(){
        this.subscribers = new ArrayList<>();
    }

    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }

        return instance;
    }

    public void placeOrder(){
        //order place logic
        for(OrderPlacedEventSubscriber subscriber : subscribers){
            subscriber.postOrderPlacedAction();
        }
    }

    public void addSubscriber(OrderPlacedEventSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(OrderPlacedEventSubscriber subscriber){
        subscribers.remove(subscriber);
    }
}
