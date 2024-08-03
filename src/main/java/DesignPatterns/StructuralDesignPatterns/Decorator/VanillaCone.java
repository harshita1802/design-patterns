package DesignPatterns.StructuralDesignPatterns.Decorator;

public class VanillaCone implements Dessert{
    private Dessert dessert;


    public VanillaCone(){}

    public VanillaCone(Dessert dessert) {
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
            return dessert.getDescription() + ", Vanilla Cone";
        }
        else{
            return "Vanilla Cone";
        }
    }
}
