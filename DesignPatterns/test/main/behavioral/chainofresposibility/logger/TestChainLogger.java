package main.behavioral.chainofresposibility.logger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to illustrate the Chain of responsibility pattern example
 * of Logger.
 * 
 * @author Sophie
 *
 */
public class TestChainLogger {

	AbstractHandler h1;
	AbstractHandler h2;
	AbstractHandler h3;
	final String ERRORRESP = "Error Console:: Logger: ";
	final String INFORESP = "Info Console:: Logger: ";

	@Before
	public void before() {
		h1 = new ErrorLogger(LogLevel.ERROR);
		h2 = new InfoLogger(LogLevel.INFO);
		h3 = new FileLogger(LogLevel.FILE);

		h1.setNextLogger(h2);
		h1.setNextLogger(h2);
	}

	@Test
	public void testError() {
		String errorMessage = "An error message";
		String response = h1.handleMessage(LogLevel.ERROR, errorMessage);

		Assert.assertEquals(response, ERRORRESP + errorMessage);
	}

	@Test
	public void testInfo() {
		String infoMessage = "An informational message";
		String response = h1.handleMessage(LogLevel.INFO, infoMessage);

		Assert.assertEquals(response, INFORESP + infoMessage);
	}

}
