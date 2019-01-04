package 抽象工厂模式;

public class Main {
	//运行时的代码不必改变！
	
	public static void main(String[] args) {
		//创建用户类
		User user1 = new UserA();
		User user2 = new UserB();
		
		//调用用户类的create_object方法实现具体的实例
		Obj object1 = user1.create_object(1);
		Obj object2 = user2.create_object(0);
		
		System.out.println(object1);
		System.out.println(object2);
	}

}
