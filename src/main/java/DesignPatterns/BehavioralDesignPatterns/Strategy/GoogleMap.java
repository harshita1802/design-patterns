package DesignPatterns.BehavioralDesignPatterns.Strategy;

import DesignPatterns.BehavioralDesignPatterns.Strategy.PathCalulators.PathCalculator;

public class GoogleMap {

    //Follows Strategy, Singleton and Factory Design Pattern as well.

    public void findPath(String source, String destination, Mode mode){
        PathCalculator pc = ModeTypeFactory.modeTypeObject(mode);

        pc.findPath(source,destination);
    }

}
