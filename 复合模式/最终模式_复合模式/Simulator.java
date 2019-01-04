package 最终模式_复合模式;

public class Simulator {

	public static void main(String[] args) {
		Simulator simulator = new Simulator();
		AbstractFactory factory = new CountingFactory();
		
		simulator.simulate(factory);
	}
	
	public void simulate (AbstractFactory factory) {
		Quackable redheadduck = factory.createRedHeadDuck();
		Quackable duckcall = factory.createDuckcall();
		Quackable rubberduck = factory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose());
		
		Flock ducks = new Flock();
		ducks.add(redheadduck);
		ducks.add(duckcall);
		ducks.add(rubberduck);
		ducks.add(goose);
		
		Flock mallardflock = new Flock();
		Quackable mallard1 = factory.createMallardDuck();
		Quackable mallard2 = factory.createMallardDuck();
		Quackable mallard3 = factory.createMallardDuck();
		mallardflock.add(mallard1);
		mallardflock.add(mallard2);
		mallardflock.add(mallard3);
		
		ducks.add(mallardflock);
		
		System.out.println("Duck Simulator!");
		Quackologist quackologist = new Quackologist();
		ducks.register(quackologist);
		
		simulate(ducks);
		
		System.out.println("The duck quacked "+QuackCounter.getnumber()+" times");
	}
	
	public void simulate (Quackable duck) {
		duck.quack();
	}
}
