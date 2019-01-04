package 迭代器模式;
import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
	ArrayList<Item> list;
	int position=0;
	
	public ArrayListIterator (ArrayList<Item> arraylist) {
		this.list=arraylist;
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
