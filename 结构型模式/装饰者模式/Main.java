package 装饰者模式;

public class Main {

	public static void main(String[] args) {
		Component component = new ConcreteComponent(1); //创建一个被修饰者
		component = new ConcreteDecorator(component);   //进行修饰
		//可以不断构造新的修饰者进行修饰
	}

}
