package 策略模式;

public class Type2 extends Basic_class {
	public Type2 () {
		ma = new MethodA2();
		mb = new MethodB2();
	}
	
	@Override
	public void methodD() {
		System.out.println("This is Type2");
	}

}
