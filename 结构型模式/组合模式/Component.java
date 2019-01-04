package 组合模式;

public abstract class Component {
	//方法默认抛出不支持操作的异常，如果子类没有实现这些方法，那么就会抛出异常
	public void operation () {
		throw new UnsupportedOperationException("operation");
	}
	
	public void add (Component component) {
		throw new UnsupportedOperationException("add");
	}
	
	public void remove (Component component) {
		throw new UnsupportedOperationException("remove");
	}
	
	public Component getChild (int index) {
		throw new UnsupportedOperationException("getChild");
	}
}
