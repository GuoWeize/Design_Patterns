package 命令模式;

public class Receiver2 {
	//可能设备有着不同的状态
	enum State {
		state1,state2,state3;
	}
	private State state = State.state1;
	
	public void methodA() {}
	public void method_antiA() {}
	
	public void methodB() {}
	public void method_antiB() {}
	
	public void setstate1 () {
		this.state=State.state1;
	}
	
	public void setstate2 () {
		this.state=State.state2;
	}
	
	public void setstate3 () {
		this.state=State.state3;
	}
	
	public State get () {
		return this.state;
	}
}
