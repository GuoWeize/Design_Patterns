package 抽象工厂模式;

public class UserA_PartFactory implements ObjectPartFactory {
	//原料工厂必须实现所有原料的生产
	
	public PartA create_partA() {
		return new PartA1();
	}

	public PartB create_partB() {
		return new PartB2();
	}

}
