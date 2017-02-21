package main.behavioral.observer.subject.observers;

import main.behavioral.observer.subject.Observer;
import main.behavioral.observer.subject.Subject;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		super(subject);
//		this.subject = subject;
//		subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

}
