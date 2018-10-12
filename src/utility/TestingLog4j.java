package utility;

import org.apache.log4j.Logger;

public class TestingLog4j {

	 // get a logger instance
	public static Logger logger = Logger.getLogger(TestingLog4j.class);

	public void testLoggerDebug() {
		logger.debug("Hello.. im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("Hello.. im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("Hello.. im in Warn method");
	}

	public void testLoggerError() {
		logger.error("Hello.. im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("Hello.. im in Fatal method");
	}

	public static void main(String[] args) {
		TestingLog4j example = new TestingLog4j();
		example.testLoggerDebug();
		example.testLoggerInfo();
		example.testLoggerWarn();
		example.testLoggerError();
		example.testLoggerFatal();
	}
}