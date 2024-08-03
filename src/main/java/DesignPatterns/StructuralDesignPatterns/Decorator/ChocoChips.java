package DesignPatterns.StructuralDesignPatterns.Decorator;

public class ChocoChips implements Dessert{
    private Dessert dessert;

    public ChocoChips(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public double getCost() {
        return dessert.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", ChocoChips";
    }
}
