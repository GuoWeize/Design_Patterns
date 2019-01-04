package 迭代器模式;

public class ArrayIterator implements Iterator {
	Item[] list;
	int position=0;
	
	public ArrayIterator (Item[] array) {
		this.list=array;
	}
	
	public boolean hasNext() {
		if (position>=list.length||list[position]==null) {
			return false;
		}
		return true;
	}

	
	public Object next() {
		Item item = list[position];
		position++;
		return item;
	}

}
