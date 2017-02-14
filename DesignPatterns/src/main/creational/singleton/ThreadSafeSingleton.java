package main.creational.singleton;

/**
 * Thread Safe implementation of Singleton Pattern
 * 
 * @author Sophie
 *
 */
public class ThreadSafeSingleton {

	private static final ThreadSafeSingleton singleton = new ThreadSafeSingleton();

	private ThreadSafeSingleton() {
	}

	// Runtime initialization
	public static ThreadSafeSingleton getInstance() {
		return singleton;
	}
}
