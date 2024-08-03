package DesignPatterns.BehavioralDesignPatterns.Strategy.PathCalulators;

public class BikePathCalculator implements PathCalculator{

    private static BikePathCalculator instance;

    private BikePathCalculator(){}

    public static BikePathCalculator getInstance(){
        if(instance == null){
            synchronized (CarPathCalculator.class){
                if(instance == null){
                    instance = new BikePathCalculator();
                }
            }
        }

        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path from "+source+" to "+destination+" via bike.");
    }
}
