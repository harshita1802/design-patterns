package DesignPatterns.CreationalDesignPatterns.Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        //Double check lock
        if(instance == null){
            //Class level locking
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
