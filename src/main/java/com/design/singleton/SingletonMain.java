package com.design.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        SingletonLogger sLogger1 = SingletonLogger.getInstance();
		SingletonLogger sLogger2 = SingletonLogger.getInstance();
		SingletonLogger sLogger3 = SingletonLogger.getInstance();
		
		sLogger1.info("0001");
		sLogger2.error("0002");
		sLogger1.debug("0001");
		sLogger3.debug("0004");
		sLogger2.info("0005");
    }
    
}
