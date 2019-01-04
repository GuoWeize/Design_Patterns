package 状态模式;

public class FiniteStateMachine {
	State state0;
	State state1;
	State state2;
	State state3;
	
	State state = state3;
	int data = 0;
	
	public FiniteStateMachine (int data) {
		this.data=data;
		this.state0 = new State0(this);
		this.state1 = new State1(this);
		this.state2 = new State2(this);
		this.state3 = new State3(this);
		if (data>0) {
			this.state=state0;
		}
	}
	
	public void methodA () {
		state.methodA();
	}
	
	public void methodB () {
		state.methodB();
	}
	
	public void methodC () {
		boolean flag = true;
		try {
		state.methodC();
		} catch (UnsupportedOperationException e) {
			flag = false;
		}
		if (flag)
			state.methodD();
	}
	
	public void change_data () {
		this.data--;
	}
	
	public void setState (State state) {
		this.state=state;
	}
}
