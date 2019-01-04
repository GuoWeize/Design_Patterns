package 最终模式_复合模式;

public class Duckcall implements Quackable {
	Observable observable;
	
	public Duckcall () {
		this.observable = new Observable(this);
	}
	
	public void quack() {
		System.out.println("Kwak");
		this.notifyObservers();
	}

	public void register(Observer observer) {
		this.observable.register(observer);
	}

	public void notifyObservers() {
		this.observable.notifyObservers();
	}

}
