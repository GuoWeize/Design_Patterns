package 策略模式;

public abstract class Basic_class {
	MethodA ma;
	MethodB mb;
	
	public Basic_class () {	
	}
	
	public void do_methodA () {
		ma.methodA();
	}
	
	public void do_methodB () {
		mb.methodB();
	}
	
	public void do_methodC () {
		System.out.println("methodC");
	}
	
	public abstract void methodD ();
	
	
	public void setMethodA (MethodA ma) {
		this.ma=ma;
	}
	
	public void setMethodB (MethodB mb) {
		this.mb=mb;
	}
}
