package DesignPatterns.BehavioralDesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMap map = new GoogleMap();
        map.findPath("Bengaluru","Dandeli",Mode.WALK);
    }
}
