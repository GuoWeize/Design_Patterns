package 抽象工厂模式;

public class UserB_PartFactory implements ObjectPartFactory {
	//原料工厂必须实现所有原料的生产
	
	public PartA create_partA() {
		return new PartA2();
	}

	public PartB create_partB() {
		return new PartB1();
	}

}
