package DesignPatterns.StructuralDesignPatterns.Decorator;

public class ChocolateCone implements Dessert{
    private Dessert dessert;

    public ChocolateCone() {
    }

    public ChocolateCone(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public double getCost() {
        if(dessert != null){
            return dessert.getCost() + 15;
        }
        else{
            return 15;
        }
    }

    @Override
    public String getDescription() {
        if(dessert != null){
            return dessert.getDescription() + ", Chocolate Cone";
        }
        else{
            return "Chocolate Cone";
        }
    }
}
