package DesignPatterns.StructuralDesignPatterns.Decorator;

public class StrawberryScoop implements Dessert{
    private Dessert dessert;

    public StrawberryScoop(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public double getCost() {
        return dessert.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Strawberry Scoop";
    }
}
