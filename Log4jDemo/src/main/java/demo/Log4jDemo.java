package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jDemo {

	static org.apache.logging.log4j.Logger logger=LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
	
		System.out.println("Hello world");
		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		System.out.println("completed");
	}

}
