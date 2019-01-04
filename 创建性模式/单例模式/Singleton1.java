package 单例模式;

//基本单例：线程不安全!
public class Singleton1 {
	private static Singleton1 uniqueInstance;  //用静态变量存储实例
	
	private Singleton1 () {}				   //私有的构造方法
	
	public static Singleton1 getInstance () {  //获取实例的方法(静态方法)
		if (uniqueInstance==null) {
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
}
