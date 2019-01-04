package 单例模式;

//双重检验单例：线程安全且省时!
public class Singleton4 {
	private static Singleton4 uniqueInstance;   //用静态变量存储实例
	
	private Singleton4 () {}    //私有的构造方法
	
	public static Singleton4 getInstance () {   //获取实例的方法(静态方法)
		if (uniqueInstance==null) {             //先检验一次是否创建了实例
			synchronized (Singleton4.class) {
				if (uniqueInstance==null)       //再检验一次是否创建了实例(线程安全)
					uniqueInstance = new Singleton4();
			}
		}
		return uniqueInstance;
	}
}
