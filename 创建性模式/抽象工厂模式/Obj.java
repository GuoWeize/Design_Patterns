package 抽象工厂模式;

public abstract class Obj {
	PartA part1;
	PartB part2;
	
	public void methodA () {
		System.out.println("Object");
	}
	
	public abstract  void methodB ();
}
