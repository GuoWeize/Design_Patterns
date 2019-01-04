package 观察者模式;

import java.util.*;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;
	private int data1;
	private double data2;
	
	public ConcreteSubject () {
		this.observers = new ArrayList<Observer>();
	}
	
	public void register(Observer observer) {
		observers.add(observer);
	}

	public void remove(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer o:observers) {
			o.update(data1, data2);
		}
	}
	
	//在某个方法中调用notifyObservers进行更新
	public void operate () {
		this.notifyObservers();
	}

}
