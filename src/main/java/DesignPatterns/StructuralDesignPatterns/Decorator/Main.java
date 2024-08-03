package DesignPatterns.StructuralDesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Dessert newDessert = new ChocoChips(
                                new ChocolateScoop(
                                        new VanillaCone(
                                                new ChocoChips(
                                                        new ChocolateCone()))));

        System.out.println(newDessert.getCost());
        System.out.println(newDessert.getDescription());
    }
}
