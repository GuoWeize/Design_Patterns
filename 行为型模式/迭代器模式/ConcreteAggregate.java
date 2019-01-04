package 迭代器模式;
import java.util.*;

public class ConcreteAggregate implements Aggregate {
	private Item[] list1 = new Item[100];
	private ArrayList<Item> list2 = new ArrayList<Item>();
	private Vector<Item> list3 = new Vector<Item>();
	private LinkedList<Item> list4 = new LinkedList<Item>();
	
	public Iterator createIterator() {
		//选择对应的数据类型实现
		return null;
	}
	
	public Iterator createArrayIterator () {
		return new ArrayIterator(list1);
	}
	
	public Iterator createArrayListIterator () {
		return new ArrayListIterator(list2);
	}
	
	public Iterator createVectorIterator () {
		return new VectorIterator(list3);
	}
	
	public Iterator createLinkedListIterator () {
		return new LinkedListIterator(list4);
	}
}
