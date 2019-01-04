package 最终模式_复合模式;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int number;
	
	public QuackCounter (Quackable duck) {
		this.duck=duck;
	}
	
	public void quack() {
		duck.quack();
		number++;
	}
	
	public static int getnumber () {
		return number;
	}

	public void register(Observer observer) {
		duck.register(observer);
	}

	public void notifyObservers() {
		duck.notifyObservers();
	}
}
