package 单例模式;

//急切单例：不管用不用到都会加载出一个单例!
public class Singleton3 {
	private static Singleton3 uniqueInstance = new Singleton3();   //用静态变量存储实例
	
	private Singleton3 () {}    //私有的构造方法
	
	public static Singleton3 getInstance () {   //获取实例的方法(静态方法)
		return uniqueInstance;
	}
	
}
