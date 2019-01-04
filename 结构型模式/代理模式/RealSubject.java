package 代理模式;

public class RealSubject implements Subject {
	//是真正做事的类
	
	public void request() {
		System.out.println("do something!");
	}

}
