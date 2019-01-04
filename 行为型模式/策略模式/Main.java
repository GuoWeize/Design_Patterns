package 策略模式;

public class Main {

	public static void main(String[] args) {
		Basic_class object1 = new Type1();
		object1.do_methodA();
		object1.do_methodB();
		
		Basic_class object2 = new Type2();
		object2.do_methodA();
		object2.setMethodA(new MethodA3());
		object2.do_methodA();
		
		Type3 object3 = new Type3();
		object3.do_methodB();
	}

}
