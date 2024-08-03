package DesignPatterns.StructuralDesignPatterns.Facade;

import DesignPatterns.StructuralDesignPatterns.Facade.Controller.Amazon;
import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Customer;
import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Product;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.AddressManagement;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.InventoryManagement;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.PaymentManagement;

public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon(new InventoryManagement(),new AddressManagement(),new PaymentManagement());

        Customer cus1 = new Customer("737623","Harshita","harshita@gmail.com","Davangere-577005",7760124028l);
        Product prod = new Product(12890,"Drools",34,975.00);

        amazon.placeOrder(cus1,prod,1,975.00);
    }
}
