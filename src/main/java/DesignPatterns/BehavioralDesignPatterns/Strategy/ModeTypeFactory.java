package DesignPatterns.BehavioralDesignPatterns.Strategy;

import DesignPatterns.BehavioralDesignPatterns.Strategy.PathCalulators.*;

public class ModeTypeFactory {

    public static PathCalculator modeTypeObject(Mode mode){

        //Enhanced switch case
        return switch(mode){
            case CAR -> CarPathCalculator.getInstance();
            case BIKE -> BikePathCalculator.getInstance();
            case WALK -> WalkPathCalculator.getInstance();
            case TRAIN -> TrainPathCalculator.getInstance();
            default -> null;
        };

    }
}
