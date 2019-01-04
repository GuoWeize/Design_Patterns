package 工厂方法模式;

public abstract class User {
	
	//子类必须实现的create方法
	protected abstract Obj create_object (int data);
	
	//可以声明为final防止子类覆盖
	public /*final*/ Obj operate_object (int data) {
		Obj object;
		
		object = create_object (data);
		
		object.methodA();
		object.methodB();
		
		return object;
	}
	
}
