package DesignPatterns.StructuralDesignPatterns.Decorator;

public class ChocolateScoop implements Dessert{
    private Dessert dessert;

    public ChocolateScoop(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public double getCost() {
        return dessert.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Chocolate Scoop";
    }
}
