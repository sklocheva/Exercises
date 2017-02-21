package main.behavioral.observer.subject;

import org.junit.Before;
import org.junit.Test;

import main.behavioral.observer.subject.observers.BinaryObserver;
import main.behavioral.observer.subject.observers.HexaObserver;
import main.behavioral.observer.subject.observers.OctalObserver;

public class TestObserverSubjectExample {

	Subject subject;
	Observer binary;
	Observer hexa;
	Observer octal;
	
	@Before
	public void before() {
		subject = new Subject();
		binary= new BinaryObserver(subject);
		hexa= new HexaObserver(subject);
		octal= new OctalObserver(subject);
	}
	
	@Test
	public void test() {
		subject.setState(2);
		System.out.println("State changed");
		subject.setState(20);
	}
}
