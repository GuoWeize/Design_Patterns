package 模板方法模式;

public abstract class Basic_Class {
	//提供一套算法
	public final void methodA (){
		methodB();
		methodC();
		methodD();
		if (hook()) {
			methodE();
		}
	}
	
	//一些方法允许子类实现
	abstract void methodC ();
	abstract void methodE ();
	
	//一些方法固定
	public final void methodB () {}
	public final void methodD () {}
	
	//提供钩子
	protected boolean hook () {
		return true;
	}
}
