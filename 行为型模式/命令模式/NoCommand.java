package 命令模式;

/**一个空的命令 (null object)
 */
public class NoCommand implements Command {
	public void excute() {
		//什么都不做!
	}

	public void undo() {
		//什么都不做!
	}
}
