package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectS {
	protected List<Observer> observers;
	
	public SubjectS() {
		this.observers = new ArrayList<Observer>();
	}
	
	public void Add(Observer observer) {
		observers.add(observer);
	}
	
	public void Remove(Observer observer) {
		observers.remove(observer);
	}
	
	abstract void NotifyObserver();
}
