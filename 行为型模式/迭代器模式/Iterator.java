package 迭代器模式;

public interface Iterator {
	boolean hasNext();  //返回boolean：是否有下个元素
	Object next();      //返回下个元素
}
