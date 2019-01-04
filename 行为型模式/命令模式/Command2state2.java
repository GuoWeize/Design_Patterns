package 命令模式;
import 命令模式.Receiver2.State;

public class Command2state2 implements Command {
	Receiver2 receiver2;  //包含一个Receiver实例(执行者)
	State old_state;       //记录旧的状态
	
	public Command2state2 (Receiver2 receiver2) {
		this.receiver2=receiver2;
	}
	
	//实现Command接口
	public void excute() {
		old_state=receiver2.get();
		receiver2.setstate2();
	}
	
	public void undo() {
		if (old_state==State.state1)
			receiver2.setstate1();
		if (old_state==State.state2)
			receiver2.setstate2();
		if (old_state==State.state3)
			receiver2.setstate3();
	}
}
