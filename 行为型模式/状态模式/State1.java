package 状态模式;

public class State1 implements State {
	private final FiniteStateMachine FSM;
	
	public State1 (FiniteStateMachine FSM) {
		this.FSM=FSM;
	}
	
	public void methodA() {
		throw new UnsupportedOperationException("State1 methodA");
	}

	public void methodB() {
		FSM.setState(FSM.state0);
	}

	public void methodC() {
		FSM.setState(FSM.state2);
	}

	public void methodD() {
		throw new UnsupportedOperationException("State1 methodD");
	}

}
