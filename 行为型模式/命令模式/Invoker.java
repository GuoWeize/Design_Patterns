package 命令模式;

//当更新时，Invoker不用修改
public class Invoker {
	Command[] commandsA;
	Command[] commandsB;
	Command undoCommand;
	
	/**Invoker构造器
	 * @param receivenumber 设备数量
	 */
	public Invoker (int receivenumber) {
		this.commandsA = new Command[receivenumber];
		this.commandsB = new Command[receivenumber];
		
		Command nocommand = new NoCommand();
		for (int i=0;i<receivenumber;i++) {
			commandsA[i] = nocommand;
			commandsB[i] = nocommand;
		}
		this.undoCommand=nocommand;
	}
	
	/**初始化设置命令
	 * @param receivernum 设备编号(0-n)
	 * @param commandA 执行methodA的命令
	 * @param commandB 执行methodB的命令
	 */
	public void setcommand (int receivernum, Command commandA, Command commandB) {
		commandsA[receivernum] = commandA;
		commandsB[receivernum] = commandB;
	}
	
	/**执行methodA命令
	 * @param receivernum 设备编号
	 */
	public void actionA (int receivernum) {
		commandsA[receivernum].excute();
		undoCommand = commandsA[receivernum];
	}
	
	/**执行methodB命令
	 * @param receivernum 设备编号
	 */
	public void actionB (int receivernum) {
		commandsB[receivernum].excute();
		undoCommand = commandsB[receivernum];
	}
	
	/**撤销上一个命令
	 */
	public void undo () {
		undoCommand.undo();
	}
}
