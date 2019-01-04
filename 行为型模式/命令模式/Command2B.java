package 命令模式;

public class Command2B implements Command {
	Receiver2 receiver2;    //包含一个Receiver实例(执行者)
	
	public Command2B (Receiver2 receiver2) {
		this.receiver2=receiver2;
	}
	
	//实现Command接口
	public void excute() {
		receiver2.methodB();
	}
	
	public void undo() {
		receiver2.method_antiB();
	}
}
