package DesignPatterns.CreationalDesignPatterns.Singleton.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger{
    private static LoggerImpl instance;
    private FileWriter pw;
    private String filePath;

    private LoggerImpl(){}

    public static LoggerImpl getInstance(){
        if(instance == null){
            synchronized (LoggerImpl.class){
                if(instance == null){
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance(){
        instance = null;
    }

    @Override
    public void log(String message){
        if(pw == null){
            throw new IllegalStateException();
        }
        String logMessage = "DateTime: " + LocalDateTime.now() + " Message: " + message;
        try{
            pw.write(logMessage);
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Invalid file path.");
        }
    }

    @Override
    public void setLogFile(String filePath) {
        try{
            this.filePath = filePath;
            this.pw = new FileWriter(filePath);
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Invalid file path.");
        }
    }

    @Override
    public String getLogFile() {
        return filePath;
    }

    @Override
    public void flush() throws IOException {
        if(pw != null){
            pw.flush();
        }
    }

    @Override
    public void close() {

    }
}
