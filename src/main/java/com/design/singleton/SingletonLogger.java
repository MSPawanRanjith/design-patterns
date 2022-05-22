package com.design.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonLogger {

    private static SingletonLogger singletonLogger = null;

    private final String logFile = "./logs/demo_log.txt";
    private PrintWriter writer;

    
    // TODO: 
    // Implement private constructor to share the LogFile writer


    
    // TODO:
    // fix this function to share resource exclusively through synchronize keyword
    
    public SingletonLogger getInstance() {
		// TODO: insert code here to getinstance without race condition

        return null;
	}

    
    public void info (String logString) {
		writer.println("INFO: " + logString);
	}
	
	public void debug (String logString) {
		writer.println("DEBUG: " + logString);
	}
	
	public void error (String logString) {
		writer.println("ERROR: " + logString);
	}
}
