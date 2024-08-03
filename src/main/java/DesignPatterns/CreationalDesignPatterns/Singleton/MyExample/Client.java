package DesignPatterns.CreationalDesignPatterns.Singleton.MyExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        //1 -> Using static attributes.

        ExecutorService executors = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            Thread th = new Thread(new DBConnection());
            executors.submit(th);
        }

        executors.shutdown();

        //2 -> This works fine too.

        Configurations.ports = 2;

        Thread th1 = new Thread(new DBConnection());
        Thread th2 = new Thread(new DBConnection());

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        /* 3 -> If we pass single DBConnection object into all threads and update static variables in the middle, the changes
        won't be applied unless we restart the server. */

        DBConnection db1 = new DBConnection();

        Configurations.ports = 4;

        Thread th3 = new Thread(db1);
        Thread th4 = new Thread(db1);
        Thread th5 = new Thread(db1);
        Thread th6 = new Thread(db1);

        th3.start();
        th4.start();
        th5.start();
        th6.start();

        th3.join();
        th4.join();
        th5.join();
        th6.join();

        /* 4 -> Singleton - Creating only one object of a class and passing it to all threads.
            So, the point is why do you want to make the attributes static if we are passing same object to all threads.
            So, DDConnection2 class has attributes that are not static unlike DBConnection class.
         */

        DBConnection2 db2 = new DBConnection2();

        ExecutorService executors2 = Executors.newFixedThreadPool(15);
        for(int i=0;i<15;i++){
            Thread th = new Thread(db2);
            executors2.submit(th);
        }

        executors2.shutdown();

        //both works fine!

    }
}
