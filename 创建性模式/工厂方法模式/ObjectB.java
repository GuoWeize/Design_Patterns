package 工厂方法模式;

public class ObjectB extends Obj {
	
	public ObjectB () {
		this.data=2;
	}
	
	//子类必须实现父类中抽象的方法
	public void methodB() {
		System.out.println("B");
	}

}
