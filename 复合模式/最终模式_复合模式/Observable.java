package 最终模式_复合模式;

import java.util.*;

public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable (QuackObservable duck) {
		this.duck=duck;
	}
	
	public void register(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

	

}
