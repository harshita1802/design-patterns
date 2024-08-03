package DesignPatterns.BehavioralDesignPatterns.Observer.Subscribers;

public class CustomerNotificationService implements OrderPlacedEventSubscriber{

    @Override
    public void postOrderPlacedAction() {
        System.out.println("Email sent to customer.");
        System.out.println("SMS sent to customer.");
    }
}
