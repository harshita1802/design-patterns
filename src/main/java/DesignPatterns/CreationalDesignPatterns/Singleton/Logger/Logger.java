package DesignPatterns.CreationalDesignPatterns.Singleton.Logger;

import java.io.IOException;

//import org.springframework.boot.logging.LogLevel;
public interface Logger {
    void log(String message) throws IOException;

    void setLogFile(String filePath);

    String getLogFile();

    // Flush the log entries to the file
    void flush() throws IOException;

    // Close the logger and release any resources
    void close();
}
