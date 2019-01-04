package 命令模式;

public class Client {
	
	public static void main (String args[]) {
		//创建一个Invoker
		Invoker invoker = new Invoker(5);
		
		//创建所有的Receiver
		Receiver1 receiver1_1 = new Receiver1();
		Receiver1 receiver1_2 = new Receiver1();
		Receiver2 receiver2_1 = new Receiver2();
		Receiver2 receiver2_2 = new Receiver2();
		
		//创建所有命令
		Command1A receiver1_1A = new Command1A(receiver1_1);
		Command1B receiver1_1B = new Command1B(receiver1_1);
		Command1A receiver1_2A = new Command1A(receiver1_2);
		Command1B receiver1_2B = new Command1B(receiver1_2);
		
		Command2A receiver2_1A = new Command2A(receiver2_1);
		Command2B receiver2_1B = new Command2B(receiver2_1);
		Command2A receiver2_2A = new Command2A(receiver2_2);
		Command2B receiver2_2B = new Command2B(receiver2_2);
		
		//将所有命令加载到Client中(共4个Receiver)
		invoker.setcommand(0, receiver1_1A, receiver1_1B);
		invoker.setcommand(1, receiver1_2A, receiver1_2B);
		invoker.setcommand(2, receiver2_1A, receiver2_1B);
		invoker.setcommand(3, receiver2_2A, receiver2_2B);
		
		//进行操作
		invoker.actionA(0);
		invoker.actionB(0);
		invoker.actionA(1);
		invoker.actionB(1);
		invoker.actionA(2);
		invoker.actionB(2);
		invoker.actionA(3);
		invoker.actionB(3);
		
		
		//创建宏
		Command[] commandset = {/*将需要的命令加进来*/};
		MacroCommand macro_command = new MacroCommand(commandset);
		invoker.setcommand(4, macro_command, new NoCommand());
		
	}
}
