package DesignPatterns.StructuralDesignPatterns.Facade.HelperClasses;

import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Customer;
import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Product;
import DesignPatterns.StructuralDesignPatterns.Facade.Exceptions.PriceChangedException;
import DesignPatterns.StructuralDesignPatterns.Facade.Exceptions.StockNotAvailableException;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.InventoryManagement;

public class InventoryManagementHelper {

    private InventoryManagement inventoryManagement;

    public InventoryManagementHelper(InventoryManagement inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public void checkStock(Customer cus, Product prod, int quantity, double price){
        if(inventoryManagement.checkStock(prod) >= quantity) {
            if (inventoryManagement.checkPrice(prod, quantity, price)) {
                inventoryManagement.deductStock(quantity, prod);
            }
            else{
                throw new PriceChangedException();
            }
        }
        else{
            throw new StockNotAvailableException();
        }
    }

}
