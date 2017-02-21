package main.behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * The Subject class collects observers and notifies them when the state is
 * changed.
 * 
 * @author Sophie
 *
 */
public class Subject {

	private List<Observer> observers;
	private int state;

	public Subject() {
		observers = new ArrayList<Observer>();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObervers();
	}

	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	private void notifyObervers() {
		for (Observer x : observers) {
			x.update();
		}
	}

}
