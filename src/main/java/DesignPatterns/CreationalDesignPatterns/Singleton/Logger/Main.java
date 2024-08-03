package DesignPatterns.CreationalDesignPatterns.Singleton.Logger;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\harsh\\Desktop\\Scalar\\JAVA\\looger.txt";
        LoggerImpl logger = LoggerImpl.getInstance();
        logger.setLogFile(filePath);
        logger.log("Logger is implemented");
        System.out.println(logger.getLogFile());

    }
}
