package DesignPatterns.StructuralDesignPatterns.Facade.Controller;

import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Customer;
import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Product;
import DesignPatterns.StructuralDesignPatterns.Facade.HelperClasses.AddressManagementHelper;
import DesignPatterns.StructuralDesignPatterns.Facade.HelperClasses.InventoryManagementHelper;
import DesignPatterns.StructuralDesignPatterns.Facade.HelperClasses.PaymentManagementHelper;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.AddressManagement;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.InventoryManagement;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.PaymentManagement;

public class Amazon {
    private InventoryManagementHelper inventoryManagementHelper;
    private AddressManagementHelper addressManagementHelper;
    private PaymentManagementHelper paymentManagementHelper;

    public Amazon(InventoryManagement inventoryManagement, AddressManagement addressManagement,
                  PaymentManagement paymentManagement){

        this.inventoryManagementHelper = new InventoryManagementHelper(inventoryManagement);
        this.addressManagementHelper = new AddressManagementHelper(addressManagement);
        this.paymentManagementHelper = new PaymentManagementHelper(paymentManagement);
    }

    public void placeOrder(Customer cus, Product prod, int quantity, double price){

        //Using helper classes we hide the actual business logic which looks complex to end user.

        inventoryManagementHelper.checkStock(cus,prod,quantity,price);

        addressManagementHelper.verifyAddress(cus);

        paymentManagementHelper.initializePayment();
    }
}
