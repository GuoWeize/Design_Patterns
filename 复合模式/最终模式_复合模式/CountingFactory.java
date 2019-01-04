package 最终模式_复合模式;

public class CountingFactory extends AbstractFactory {

	public Quackable createMallardDuck() {
		return new QuackCounter (new MallardDuck());
	}

	public Quackable createRedHeadDuck() {
		return new QuackCounter (new RedHeadDuck());
	}

	public Quackable createDuckcall() {
		return new QuackCounter (new Duckcall());
	}

	public Quackable createRubberDuck() {
		return new QuackCounter (new RubberDuck());
	}

}
