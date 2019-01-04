package 状态模式;

public class State3 implements State {
	private final FiniteStateMachine FSM;
	
	public State3 (FiniteStateMachine FSM) {
		this.FSM=FSM;
	}
	
	public void methodA() {
		throw new UnsupportedOperationException("State3 methodA");
	}

	public void methodB() {
		throw new UnsupportedOperationException("State3 methodB");
	}

	public void methodC() {
		throw new UnsupportedOperationException("State3 methodC");
	}

	public void methodD() {
		throw new UnsupportedOperationException("State3 methodD");
	}
	
}
