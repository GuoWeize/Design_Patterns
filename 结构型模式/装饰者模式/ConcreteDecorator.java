package 装饰者模式;

public class ConcreteDecorator extends Decorator{
	Component wrappedObject; //用实例变量记录被装饰者
	Object newState;         //装饰者可以扩展Component的状态
	
	public ConcreteDecorator (Component component) {  //通过构造器记录被装饰者
		this.wrappedObject=component;
	}
	
	@Override
	public int methodA() {   //通过调用Component的方法实现
		return 0;
	}

	@Override
	public void methodB() {  //通过调用Component的方法实现
		
	}
	
}
