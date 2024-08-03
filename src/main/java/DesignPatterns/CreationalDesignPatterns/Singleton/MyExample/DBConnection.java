package DesignPatterns.CreationalDesignPatterns.Singleton.MyExample;


public class DBConnection implements Runnable{
    public static Integer noOfConnections = 0;
    public static final int limit = Configurations.ports;

    @Override
    public void run() {

        synchronized (noOfConnections) {
            if (noOfConnections < limit) {
                noOfConnections++;
                System.out.println(noOfConnections);
                System.out.println(Thread.currentThread().getName() + " connected to Database");
            }
            else {
                System.out.println("Server is busy");
            }
        }

    }
}
