package DesignPatterns.BehavioralDesignPatterns.Observer;

import DesignPatterns.BehavioralDesignPatterns.Observer.Publisher.Amazon;
import DesignPatterns.BehavioralDesignPatterns.Observer.Subscribers.CustomerNotificationService;
import DesignPatterns.BehavioralDesignPatterns.Observer.Subscribers.InvoiceGeneratorService;
import DesignPatterns.BehavioralDesignPatterns.Observer.Subscribers.OrderPlacedEventSubscriber;

public class Main {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();

        //adding subscribers to list
        OrderPlacedEventSubscriber notifier = new CustomerNotificationService();
        amazon.addSubscriber(notifier);

        OrderPlacedEventSubscriber invoiceGenerator = new InvoiceGeneratorService();
        amazon.addSubscriber(invoiceGenerator);

        //performing event
        amazon.placeOrder();

    }
}
