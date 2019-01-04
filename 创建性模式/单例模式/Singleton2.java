package 单例模式;

//简单同步单例：性能很差!
public class Singleton2 {
	private static Singleton2 uniqueInstance;   //用静态变量存储实例
	
	private Singleton2 () {}    //私有的构造方法
	
	public static synchronized Singleton2 getInstance () {    //获取实例的方法(静态方法)
		if (uniqueInstance==null) {             //检验是否创建了实例
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}
	
}
