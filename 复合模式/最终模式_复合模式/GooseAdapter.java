package 最终模式_复合模式;

public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter (Goose goose) {
		this.goose=goose;
	}
	
	public void quack() {
		goose.honk();
	}

	public void register(Observer observer) {
		System.out.println("Goose can't quack!");
	}

	public void notifyObservers() {
		System.out.println("Goose can't quack!");
	}

}
