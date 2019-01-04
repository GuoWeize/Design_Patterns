package 代理模式;

public class Proxy implements Subject {
	//持有Subject引用
	private Subject subject;
	
	public Proxy (Subject subject) {
		this.subject=subject;
	}
	
	public void request() {
		this.subject.request();
	}

}
