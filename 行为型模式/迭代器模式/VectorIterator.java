package 迭代器模式;
import java.util.Vector;

public class VectorIterator implements Iterator {
	Vector<Item> list;
	int position=0;
	
	public VectorIterator (Vector<Item> vector) {
		this.list=vector;
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
