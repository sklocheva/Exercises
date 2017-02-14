package main.creational.singleton;

/**
 * Classic Singleton Pattern, not thread safe.
 * 
 * @author Sophie
 *
 */
public class Singleton {

	Singleton singleton;

	private Singleton() {

	}

	public Singleton getIntance() {
		if (singleton != null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
