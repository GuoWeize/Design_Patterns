package 装饰者模式;

public abstract class Decorator extends Component{
	public abstract int methodA(); //对于主类实现了的方法，必须重写！
	//public abstract void methodB();  对于没实现的方法，可以不写
}
