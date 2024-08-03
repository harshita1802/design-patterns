package DesignPatterns.BehavioralDesignPatterns.Strategy.PathCalulators;

public class TrainPathCalculator implements PathCalculator{

    private static TrainPathCalculator instance;

    private TrainPathCalculator(){}

    public static TrainPathCalculator getInstance(){
        if(instance == null){
            synchronized (CarPathCalculator.class){
                if(instance == null){
                    instance = new TrainPathCalculator();
                }
            }
        }

        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path from "+source+" to "+destination+" via train.");
    }
}
