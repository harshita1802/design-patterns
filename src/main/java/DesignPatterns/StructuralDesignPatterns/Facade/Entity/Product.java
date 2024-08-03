package DesignPatterns.StructuralDesignPatterns.Facade.Entity;

public class Product {
    private int prodId;
    private String prodName;
    private int quantity;
    private double price;

    public Product(int prodId, String prodName, int quantity, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProdId() {
        return prodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProdName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

}
