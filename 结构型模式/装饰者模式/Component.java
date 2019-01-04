package 装饰者模式;

public abstract class Component {
	int data; //可以有某些属性
	
	public int methodA(){   //可以实现某些方法
		return data;
	}
	
	public abstract void methodB();
	//要有抽象方法
}
