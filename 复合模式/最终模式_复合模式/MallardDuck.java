package 最终模式_复合模式;

public class MallardDuck implements Quackable {
	Observable observable;
	
	public MallardDuck () {
		this.observable = new Observable(this);
	}
	
	public void quack() {
		System.out.println("Quack");
		this.notifyObservers();
	}

	public void register(Observer observer) {
		this.observable.register(observer);
	}

	public void notifyObservers() {
		this.observable.notifyObservers();
	}

}
