package 装饰者模式;

public class ConcreteComponent extends Component {
	public ConcreteComponent (int data) {
		this.data=data;
	}
	
	/*可以重写主类实现的方法，也可以不重写
	@Override
	public int methodA() {
		return 0;
	}
	*/
	
	@Override
	public void methodB() {
		//主类未实现的方法，必须实现！
	}

}
