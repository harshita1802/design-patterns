package DesignPatterns.BehavioralDesignPatterns.Observer.Subscribers;

public class InvoiceGeneratorService implements OrderPlacedEventSubscriber{

    @Override
    public void postOrderPlacedAction() {
        System.out.println("Invoice generated.");
    }
}
