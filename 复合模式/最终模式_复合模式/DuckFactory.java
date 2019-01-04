package 最终模式_复合模式;

public class DuckFactory extends AbstractFactory {

	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	public Quackable createDuckcall() {
		return new Duckcall();
	}

	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
