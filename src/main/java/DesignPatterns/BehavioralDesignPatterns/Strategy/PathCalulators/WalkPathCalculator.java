package DesignPatterns.BehavioralDesignPatterns.Strategy.PathCalulators;

public class WalkPathCalculator implements PathCalculator{

    private static WalkPathCalculator instance;

    private WalkPathCalculator(){}

    public static WalkPathCalculator getInstance(){
        if(instance == null){
            synchronized (WalkPathCalculator.class){
                if(instance == null){
                    instance = new WalkPathCalculator();
                }
            }
        }

        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path from "+source+" to "+destination+" via walk.");

    }
}
