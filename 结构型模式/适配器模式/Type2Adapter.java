package 适配器模式;

public class Type2Adapter implements Target {
	Adaptee adaptee;
	
	public Type2Adapter (Adaptee adaptee) {
		this.adaptee=adaptee;
	}
	
	public void methodA() {
		this.adaptee.methodA();
	}

	public void methodB() {
		//调用adaptee.methodC实现
		this.adaptee.methodC();
	}

}
