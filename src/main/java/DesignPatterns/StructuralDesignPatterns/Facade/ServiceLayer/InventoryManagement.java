package DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer;

import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Product;

public class InventoryManagement {
    public int checkStock(Product prod) {
        return prod.getQuantity();
    }

    public void deductStock(int quantity,Product prod) {
        prod.setQuantity(prod.getQuantity()-quantity);
    }

    public boolean checkPrice(Product prod, int quantity, double price) {
        return prod.getPrice() * quantity == price * quantity ? true : false;
    }
}
