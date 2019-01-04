package 观察者模式;

public class ConcreteObserver implements Observer {
	private Subject concretesubject;
	private int data1;
	private double data2;
	
	//需要传进具体的监视着作为参数，并进行注册
	public ConcreteObserver (Subject concretesubject) {
		this.concretesubject=concretesubject;
		this.concretesubject.register(this);
	}
	
	public void update(int data1, double data2) {
		this.data1=data1;
		this.data2=data2;
	}
	
	public String toString () {
		return "data1:"+data1+"data2:"+data2;
	}
}
