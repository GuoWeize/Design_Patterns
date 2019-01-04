package 策略模式;

public class Type3 {
	MethodB mb;
	
	public Type3 () {
		this.mb=new MethodB3();
	}
	
	public void do_methodB () {
		mb.methodB();
	}
}
