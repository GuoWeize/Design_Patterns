package 命令模式;

public class MacroCommand implements Command {
	Command[] commands;      //包含一个Command数组
	
	public MacroCommand (Command[] commands) {
		this.commands=commands;
	}
	
	//实现Command接口
	public void excute() {
		for (int i=0;i<commands.length;i++) {
			commands[i].excute();
		}
	}
	
	public void undo() {
		for (int i=commands.length;i>0;i--) {
			commands[i].undo();
		}
	}

}
