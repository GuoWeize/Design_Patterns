package 状态模式;

public class State2 implements State {
	private final FiniteStateMachine FSM;
	
	public State2 (FiniteStateMachine FSM) {
		this.FSM=FSM;
	}
	
	public void methodA() {
		throw new UnsupportedOperationException("State2 methodA");
	}

	public void methodB() {
		throw new UnsupportedOperationException("State2 methodB");
	}

	public void methodC() {
		throw new UnsupportedOperationException("State2 methodC");
	}

	public void methodD() {
		FSM.change_data();
		if (FSM.data>0) {
			FSM.setState(FSM.state0);
		}
		else {
			FSM.setState(FSM.state3);
		}
	}

}
