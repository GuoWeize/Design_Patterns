package 命令模式;

public class Command1B implements Command {
	Receiver1 receiver1;    //包含一个Receiver实例(执行者)
	
	public Command1B (Receiver1 receiver1) {
		this.receiver1=receiver1;
	}
	
	//实现Command接口
	public void excute() {
		receiver1.methodB();
	}
	
	public void undo() {
		receiver1.method_antiB();
	}
}
