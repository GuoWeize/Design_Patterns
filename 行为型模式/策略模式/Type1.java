package 策略模式;

public class Type1 extends Basic_class {
	public Type1 () {
		ma = new MethodA1();
		mb = new MethodB1();
	}
	
	@Override
	public void methodD() {
		System.out.println("This is Type1");

	}

}
