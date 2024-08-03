package DesignPatterns.CreationalDesignPatterns.Singleton.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    private int maxConnections;
    private HashMap<DatabaseConnection,String> dbCon;

    private ConnectionPoolImpl(){}

    private ConnectionPoolImpl(int maxConnections){
        this.maxConnections = maxConnections;
        this.dbCon = new HashMap<>();
    }


    public static ConnectionPoolImpl getInstance(int maxConnections){
        if(instance == null){
            synchronized (ConnectionPoolImpl.class){
                if(instance == null){
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }

        return instance;
    }

    public static void resetInstance(){
        instance = null;
    }


    @Override
    public void initializePool() {
        for(int i=0;i<maxConnections;i++){
            dbCon.put(new DatabaseConnection(),"available");
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        Set set = dbCon.entrySet();
        Iterator<Map.Entry<DatabaseConnection,String>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry<DatabaseConnection,String> map = itr.next();
            if(map.getValue() == "available"){
                synchronized (ConnectionPoolImpl.class){
                    if(map.getValue() == "available"){
                        dbCon.replace(map.getKey(),"unavailable");
                        return map.getKey();
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        dbCon.replace(connection, "available");
    }

    @Override
    public int getAvailableConnectionsCount() {
        int cnt = 0;
        Set set = dbCon.entrySet();
        Iterator<Map.Entry<DatabaseConnection,String>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry<DatabaseConnection,String> map = itr.next();
            if(map.getValue() == "available"){
                cnt++;
            }
        }

        return cnt;
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
}