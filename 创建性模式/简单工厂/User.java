package 简单工厂;

public class User {
	SimpleObjectFactory factory;
	
	public User (SimpleObjectFactory factory) {
		this.factory=factory;
	}
	
	public Obj operate_object (int data) {
		Obj object;
		object = factory.create_object(data);
		
		object.methodA();
		object.methodB();
		
		return object;
	}
	
}
