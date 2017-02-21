package main.behavioral.observer.subject;

public abstract class Observer {

	protected Subject subject;

	protected Observer(Subject subject){
		this.subject = subject;
		subject.addObserver(this);
	}
	public abstract void update();
}
