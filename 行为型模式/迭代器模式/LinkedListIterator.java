package 迭代器模式;
import java.util.LinkedList;

public class LinkedListIterator implements Iterator {
	LinkedList<Item> list;
	int position=0;
	
	public LinkedListIterator (LinkedList<Item> linkedlist) {
		this.list=linkedlist;
	}
	
	public boolean hasNext() {
		if (position>=list.size())
			return false;
		return true;
	}

	public Object next() {
		Item item = list.get(position);
		position++;
		return item;
	}

}
