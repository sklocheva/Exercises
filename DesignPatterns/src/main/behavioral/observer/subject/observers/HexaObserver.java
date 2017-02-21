package main.behavioral.observer.subject.observers;

import main.behavioral.observer.subject.Observer;
import main.behavioral.observer.subject.Subject;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		super(subject);
//		this.subject = subject;
//		subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
	}

}
