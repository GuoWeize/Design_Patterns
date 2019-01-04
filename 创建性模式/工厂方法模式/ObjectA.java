package 工厂方法模式;

public class ObjectA extends Obj {
	
	public ObjectA () {
		this.data=1;
	}
	
	//子类必须实现父类中抽象的方法
	public void methodB() {
		System.out.println("A");
	}

}
