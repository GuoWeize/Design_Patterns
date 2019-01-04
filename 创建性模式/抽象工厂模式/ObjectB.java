package 抽象工厂模式;

public class ObjectB extends Obj {
	ObjectPartFactory factory;
	
	public ObjectB (ObjectPartFactory factory) {
		this.factory = factory;
	}
	
	//子类必须实现父类中抽象的方法
	public void methodB() {
		this.part1 = factory.create_partA();
		this.part2 = factory.create_partB();
		System.out.println("B");
	}

}
