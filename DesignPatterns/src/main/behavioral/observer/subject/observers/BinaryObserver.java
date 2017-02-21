package main.behavioral.observer.subject.observers;

import main.behavioral.observer.subject.Observer;
import main.behavioral.observer.subject.Subject;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		super(subject);
//		this.subject = subject;
//		subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
