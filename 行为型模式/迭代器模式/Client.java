package 迭代器模式;

public class Client {
	Aggregate aggregate;
	
	public Client (Aggregate aggregate) {
		this.aggregate=aggregate;
	}
	
	public void methodA () {
		//创建一个迭代器
		Iterator iterator = this.aggregate.createIterator();
		
		//如果有下一个元素，则取出
		if (iterator.hasNext()) {
			Object o = iterator.next();
		}
	}
	
}
