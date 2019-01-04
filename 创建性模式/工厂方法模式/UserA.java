package 工厂方法模式;

public class UserA extends User {

	//每个子类对create_object有着自己的实现
	public Obj create_object(int data) {
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
