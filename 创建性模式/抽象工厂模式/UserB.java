package 抽象工厂模式;

public class UserB extends User {

	//每个子类对create_object有着自己的实现
	public Obj create_object(int data) {
		Obj object = null;
		ObjectPartFactory factory = new UserB_PartFactory(); //创建自己的原料工厂
		
		if (data>0) {
			object = new ObjectA(factory);  //把原料工厂传给每个产品
		}
		else {
			object = new ObjectB(factory);
		}
		return object;
	}	

}
