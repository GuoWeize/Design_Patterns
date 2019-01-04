package 简单工厂;

public class SimpleObjectFactory {
	
	public Obj create_object (int data) {  //工厂的创建方法
		Obj object = null;
		if (data>0) {
			object = new ObjectA();  //用new实例化具体的类
		}
		else {
			object = new ObjectB();
		}
		return object;
	}
	
	
}
