package 外观模式;

public class 最少知识原则 {
	//在一个类中，只能引用以下几个对象的方法
	
	private String s;						//类的组件
	
	public void methodA (Integer integer) { //方法参数对象
		Double d = new Double(1);			//方法中新建的对象
		this.methodB(d,s);					//自身对象
	}
	
	public void methodB (Double d,String s) {}
}
