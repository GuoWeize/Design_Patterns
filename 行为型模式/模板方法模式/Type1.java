package 模板方法模式;

public class Type1 extends Basic_Class {
	
	public void methodC () {}
	public void methodE () {}
	
	//子类实现钩子,选择是否执行methodE
	public boolean hook () {
		if (0/0==0) 
			return true;
		else
			return false;
	}
}
