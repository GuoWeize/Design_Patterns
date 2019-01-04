package 状态模式;

public class State0 implements State {
	private final FiniteStateMachine FSM;
	
	public State0 (FiniteStateMachine FSM) {
		this.FSM=FSM;
	}
	
	public void methodA() {
		FSM.setState(FSM.state1);
	}

	public void methodB() {
		throw new UnsupportedOperationException("State0 methodB");
	}

	public void methodC() {
		throw new UnsupportedOperationException("State0 methodC");
	}

	public void methodD() {
		throw new UnsupportedOperationException("State0 methodD");
	}

}
