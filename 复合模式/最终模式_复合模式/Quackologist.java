package 最终模式_复合模式;

public class Quackologist implements Observer {

	public void update(QuackObservable duck) {
		System.out.println("Quackologist: "+duck.getClass()+" just quacked.");
	}

}
